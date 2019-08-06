package com.cc.Game;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
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
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\Game2.sqlite", "player");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Player()));
		return "list";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET) //회원가입
	public String join(Locale locale, Model model) {
		return "join";
	}
	@RequestMapping(value = "/my_account", method = RequestMethod.GET) // 내정보 보기
	public String myAccount(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\Game2.sqlite", "player");
		if (session != null && session.getAttribute("user_idx") != null) {
			model.addAllAttributes(dbCommon.detailsData(new Player(), (Integer)session.getAttribute("user_idx")));
		}
		return "my_card";
	}
	@RequestMapping(value = "/do_join", method = RequestMethod.POST)
	public String doJoin(Locale locale, Model model, HttpServletRequest request) {
		MessageDigest md;
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
			}
			password = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\Game2.sqlite", "player");
		dbCommon.insertData(new Player(id, password, name));
		model.addAttribute("message", "가입되었습니다.");
		return "done";
	}	
	@RequestMapping(value = "/login", method = RequestMethod.GET) // 로그인
	public String login(Locale locale, Model model) {
		return "sign_in";
	}
	@RequestMapping(value = "/do_login", method = RequestMethod.POST) // 비밀번호 해쉬값을 비교??
	public String doLogin(Locale locale, Model model, HttpServletRequest request, @RequestParam("id") String id, @RequestParam("password") String password) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\Game2.sqlite", "player");
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
			}
			password = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		int userIdx = dbCommon.signIn(id, password);
		if (userIdx > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("user_idx", userIdx);
			return "redirect:/";
		}
		return "redirect:/login";
	}
	@RequestMapping(value = "/change_card", method = RequestMethod.GET)
	public String changeCard(Locale locale, Model model, HttpServletRequest request) {
//		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\Game2.sqlite", "player");
//		HttpSession session = request.getSession();
//		HashMap<String, String> userData = dbCommon.detailsData(new Player(), (Integer)session.getAttribute("user_idx"));
//		int idx = Integer.parseInt(userData.get("idx"));
//		String id = userData.get("id");
//		String password = userData.get("password");
//		String name = userData.get("name");
//		dbCommon.updateData(new Player(id, password, name), idx);
		
		HttpSession session = request.getSession();
		int idx = (Integer)session.getAttribute("user_idx");
		Update2 update2 = new Update2();
		update2.method2(idx);
		
		return "redirect:/my_account";
	}
	
	@RequestMapping(value = "/battle", method = RequestMethod.POST)
	public String battle(Locale locale, Model model, HttpServletRequest request, @RequestParam("select1") int select1, @RequestParam("select2") int select2) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\Game2.sqlite", "player");
//		int p1 = Integer.parseInt(select1);
//		int p2 = Integer.parseInt(select2);
		
		HashMap<String, String> userData1 = dbCommon.detailsData(new Player(),select1);
		HashMap<String, String> userData2 = dbCommon.detailsData(new Player(),select2);
		String idx = userData1.get("idx");
		String name = userData1.get("name");
		String attackPower = userData1.get("attackPower");
		String attackRate = userData1.get("attackRate");
		String defensePower = userData1.get("defensePower");
		String defenseRate = userData1.get("defenseRate");
		
		String idx2 = userData2.get("idx");
		String name2 = userData2.get("name");
		String attackPower2 = userData2.get("attackPower");
		String attackRate2 = userData2.get("attackRate");
		String defensePower2 = userData2.get("defensePower");
		String defenseRate2 = userData2.get("defenseRate");
		
		int select1HP = 1000;
		System.out.println(name);
		model.addAttribute("idx1", idx);
		model.addAttribute("name1", name);
		model.addAttribute("attackPower1", attackPower);
		model.addAttribute("attackRate1", attackRate);
		model.addAttribute("defensePower1", defensePower);
		model.addAttribute("defenseRate1", defenseRate);
		model.addAttribute("select1HP", select1HP);
		
		
		int select2HP = 1000;
		model.addAttribute("idx2", idx2);
		model.addAttribute("name2", name2);
		model.addAttribute("attackPower2", attackPower2);
		model.addAttribute("attackRate2", attackRate2);
		model.addAttribute("defensePower2", defensePower2);
		model.addAttribute("defenseRate2", defenseRate2);
		model.addAttribute("select2HP", select2HP);
		
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Player()));
		
		
		model.addAttribute("select1", idx);
		model.addAttribute("select2", idx2);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("idx1",userData1.get("idx"));
		session.setAttribute("name1", userData1.get("name"));
		session.setAttribute("attackPower1",userData1.get("attackPower"));
		session.setAttribute("attackRate1",userData1.get("attackRate"));
		session.setAttribute("defensePower1",userData1.get("defensePower"));
		session.setAttribute("defenseRate1",userData1.get("defenseRate"));
		session.setAttribute("select1HP",select1HP);
		
		session.setAttribute("idx2",userData2.get("idx"));
		session.setAttribute("name2", userData2.get("name"));
		session.setAttribute("attackPower2",userData2.get("attackPower"));
		session.setAttribute("attackRate2",userData2.get("attackRate"));
		session.setAttribute("defensePower2",userData2.get("defensePower"));
		session.setAttribute("defenseRate2",userData2.get("defenseRate"));
		session.setAttribute("select2HP",select2HP);
		return "battle";
	}
	
	@RequestMapping(value = "/do_battle", method = RequestMethod.GET)
	public String dobattle(Locale locale, Model model, HttpServletRequest request, @RequestParam("select1") int select1, @RequestParam("select2") int select2) {
	
		HttpSession session = request.getSession();
		
		int select1Idx = Integer.parseInt((String)session.getAttribute("idx1"));
		String select1Name = (String)session.getAttribute("name1");
		int select1AttackPower = Integer.parseInt((String)session.getAttribute("attackPower1"));
		int select1AttackRate = Integer.parseInt((String)session.getAttribute("attackRate1"));
		int select1DefensePower = Integer.parseInt((String)session.getAttribute("defensePower1"));
		int select1DefenseRate = Integer.parseInt((String)session.getAttribute("defenseRate1"));
		int select1HP = (Integer)session.getAttribute("select1HP");
		
		int select2Idx = Integer.parseInt((String)session.getAttribute("idx2"));
		String select2Name = (String)session.getAttribute("name2");
		int select2AttackPower = Integer.parseInt((String)session.getAttribute("attackPower2"));
		int select2AttackRate = Integer.parseInt((String)session.getAttribute("attackRate2"));
		int select2DefensePower = Integer.parseInt((String)session.getAttribute("defensePower2"));
		int select2DefenseRate = Integer.parseInt((String)session.getAttribute("defenseRate2"));
		int select2HP = (Integer)session.getAttribute("select2HP");
		
		select1HP = select1HP-(select2AttackPower-select1DefensePower);
		select2HP = select2HP-(select1AttackPower-select2DefensePower);
		
		model.addAttribute("idx1", select1Idx);
		model.addAttribute("name1", select1Name);
		model.addAttribute("attackPower1", select1AttackPower);
		model.addAttribute("attackRate1", select1AttackRate);
		model.addAttribute("defensePower1", select1DefensePower);
		model.addAttribute("defenseRate1", select1DefenseRate);
		model.addAttribute("select1HP", select1HP);

		model.addAttribute("idx2", select2Idx);
		model.addAttribute("name2", select2Name);
		model.addAttribute("attackPower2", select2AttackPower);
		model.addAttribute("attackRate2", select2AttackRate);
		model.addAttribute("defensePower2", select2DefensePower);
		model.addAttribute("defenseRate2", select2DefenseRate);
		model.addAttribute("select2HP", select2HP);
		
		Random ran = new Random();
		model.addAttribute("random_number", ran.nextInt(10000));
		
		session.setAttribute("idx1","" +select1Idx);
		session.setAttribute("name1","" +select1Name);
		session.setAttribute("attackPower1","" +select1AttackPower);
		session.setAttribute("attackRate1","" +select1AttackRate);
		session.setAttribute("defensePower1","" +select1DefensePower);
		session.setAttribute("defenseRate1","" +select1DefenseRate);
		session.setAttribute("select1HP",select1HP);
		
		session.setAttribute("idx2","" +select2Idx);
		session.setAttribute("name2","" +select1Name);
		session.setAttribute("attackPower2","" +select2AttackPower);
		session.setAttribute("attackRate2","" +select2AttackRate);
		session.setAttribute("defensePower2","" +select2DefensePower);
		session.setAttribute("defenseRate2","" +select2DefenseRate);
		session.setAttribute("select2HP",select2HP);
		return "battle";
	}
	
	@RequestMapping(value = "/secession", method = RequestMethod.GET)
	public String secession(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		int idx = (Integer)session.getAttribute("user_idx");
		Update2 update2 = new Update2();
		update2.method3(idx);
		session.invalidate();
		return "redirect:/";
	}
}
