package com.cc.Moth;

import java.util.Locale;

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
		DBCommon dbCommon = new DBCommon();
		
		
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Player()));
		return "list2";
	}
	
	@RequestMapping(value = "/create_db", method = RequestMethod.GET)
	public String createDB(Locale locale, Model model) {
		CreateDatabase createDatabase = new CreateDatabase();
		createDatabase.createTable();
		return "done";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\test2.sqlite", "studentList");
		model.addAllAttributes(dbCommon.detailsData(new Player(), idx));
		return "update";
	}
	
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(@RequestParam("idx") int idx, @RequestParam("name") String name,@RequestParam("middleTest") String middleTest, @RequestParam("finalTest") String finalTest) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\test2.sqlite", "studentList");

		
		dbCommon.updateData(new Player(name, middleTest, finalTest), idx);
		return "done";
	}
	
	@RequestMapping(value = "/done", method = RequestMethod.GET)
	public String done(Locale locale, Model model) {
		
		return "done";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String secession(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		int idx = (Integer)session.getAttribute("user_idx");
		InsertData update2 = new InsertData();
		update2.method2(idx);
		return "redirect:/my_account";
	}


	
}
