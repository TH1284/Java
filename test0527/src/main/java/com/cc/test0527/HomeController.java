package com.cc.test0527;

import java.lang.reflect.Field;
import java.util.Locale;

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
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		SelectData selectData = new SelectData();
//		selectData.selectStudent();
//		selectData.getSeoul();
//		selectData.getGyeonggido();
//		model.addAttribute("select_result", selectData.getHtmlString());
//		model.addAttribute("seoul_count", selectData.seoulCount);
//		model.addAttribute("gyeonggido_count", selectData.gyeonggidoCount);
//		return "list";
//	}
//	@RequestMapping(value = "/input_student", method = RequestMethod.GET)
//	public String inputStudent(Locale locale, Model model) {
//		Class<?> c = (new Student(0, "1", "1", "1")).getClass();
//		return "input_student";
//	}	
//	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
//	public String inputData(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("birthday") String birthday) {
//		Student student = new Student(0, name, address, birthday);
//		InsertData insertData = new InsertData();
//		insertData.insertStudent(student);
//		return "done";
//	}
//	@RequestMapping(value = "/create_db", method = RequestMethod.GET)
//	public String createDB(Locale locale, Model model) {
//		CreateDatabase createDatabase = new CreateDatabase();
//		createDatabase.createTable();
//		return "done";
//	}
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public String test(Locale locale, Model model) {
//		Student student = new Student(1, "abc", "bb", "cc");
//		Class<?> dataClass = student.getClass();
//		try {
//		Field field = dataClass.getField("idx");
//		System.out.println(field);
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return "done";
//	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student");
//		ArrayList<People> studentList = dbCommon.selectArrayList(new People());
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Student()));
		return "list";
	}
	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student");
		dbCommon.createTable(new Student());
		return "done";
	}
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("birthday_month") String birthdayMonth, @RequestParam("birthday_day") String birthdayDay, @RequestParam("favoriteColor") String favoriteColor) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student");
		dbCommon.insertData(new Student(name, address, birthdayMonth + "/" + birthdayDay, favoriteColor));
		return "done";
	}
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student");
		Student details = dbCommon.detailsData(new Student(), idx);
		if (details != null) {
			model.addAttribute("idx_value", details.idx);
			model.addAttribute("name_value", details.name);
			model.addAttribute("address_value", details.address);
			model.addAttribute("color_value", details.favoriteColor);
			String[] birthdaySplit = details.birthday.split("/");
			if (birthdaySplit.length == 2) {
				model.addAttribute("select_month_" + birthdaySplit[0], "selected");
				model.addAttribute("select_day_" + birthdaySplit[1], "selected");
			}
		}
		return "modify";
	}
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(@RequestParam("idx") int idx, @RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("birthday_month") String birthdayMonth, @RequestParam("birthday_day") String birthdayDay, @RequestParam("favoriteColor") String favoriteColor) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student");
		dbCommon.updateData(new Student(name, address, birthdayMonth + "/" + birthdayDay, favoriteColor), idx);
		return "done";
	}
}
