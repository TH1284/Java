package com.cc.java0805;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cc.java0805.DBCommon;
import com.cc.java0805.HomeController;
import com.cc.java0805.Student;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		DBCommon dbCommon = new DBCommon("finalseasonalitydata3");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Student()));
		System.out.println("작동확인");
		return "list2";
	}
}

