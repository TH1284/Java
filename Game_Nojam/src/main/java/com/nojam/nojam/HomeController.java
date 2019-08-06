package com.nojam.nojam;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "main";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {

		return "login";
	}
	
	@RequestMapping(value = "/newplayer", method = RequestMethod.GET)
	public String newplayer(Locale locale, Model model) {
		return "newplayer";
	}
	

	@RequestMapping(value = "/create_db", method = RequestMethod.GET)
	public String createDB(Locale locale, Model model) {
		CreateDatabase createDatabase = new CreateDatabase();
		createDatabase.createTable();
		return "done";
	}
	
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(@RequestParam("name") String name, @RequestParam("attackPower") int attackPower, @RequestParam("defencePower") int defencePower, @RequestParam("attackRate") int attackRate, @RequestParam("defenceRate") int defenceRate, @RequestParam("HP") int HP) {
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\game.sqlite", "playerList");
		dbCommon.insertData(new Person(name, attackPower, defencePower ,attackRate, defenceRate, HP));
		return "done";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		System.out.println("list");
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\game.sqlite", "playerList");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Person()));
		return "list";
	}
	
	
	
	@RequestMapping(value = "/startGame", method = RequestMethod.GET)
	public String startGame(Locale locale, Model model, @RequestParam("idx") int idx) {
		System.out.println(idx);
		Random random = new Random();
		int comint = random.nextInt(1);
		System.out.println(comint);
		DBCommon<Com> dbCommon2 = new DBCommon<Com>("c:\\tomcat\\game.sqlite", "comlist");
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\game.sqlite", "playerList");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Person()));
		model.addAttribute("select_result_person", dbCommon.detailsData3(new Person(), idx));
		model.addAttribute("select_result_com", dbCommon2.detailsData(new Com(), comint));
		
		return "startGame";
	}
	
	
	
	@RequestMapping(value = "/doSignIn", method = RequestMethod.GET)
	public String doSignIn(Locale locale, Model model, HttpServletRequest request, @RequestParam("name") String name) {
		
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\game.sqlite", "playerList");
		if (dbCommon.signIn(name)) {
			HttpSession session = request.getSession();
			session.setAttribute("login", true);
			return "redirect:/list";
		} else {
			return "redirect:/login";
		}
	}
}

