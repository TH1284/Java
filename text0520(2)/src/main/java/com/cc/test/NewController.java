package com.cc.test;

import java.sql.SQLException;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewController {
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String test2(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat\\tomcat.sqlite", "students");
		dataReader.open();
		try {
			model.addAttribute("query_result", dataReader.selectData()); // createTable, insertData, selectData 순서대로 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		} finally {
			dataReader.close();
		}
		return "test2";
	}
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public String test3(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat\\tomcat.sqlite", "students");
		dataReader.open();
		try {
			model.addAttribute("query_result", dataReader.selectData()); // createTable, insertData, selectData 순서대로 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		} finally {
			dataReader.close();
		}
		return "test2";
	}
}
