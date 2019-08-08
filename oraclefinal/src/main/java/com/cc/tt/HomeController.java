package com.cc.tt;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cc.tt.DBCommon;
import com.cc.tt.People;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createtable(Locale locale, Model model) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\people0808(2).sqlite", "people");
		dbCommon.createTable(new People());
		return "done";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\people0808(2).sqlite", "people");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new People()));
		return "list";
	}
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputdata(@RequestParam("name") String name, @RequestParam("favoriteColor") String favoriteColor, @RequestParam("address") String address) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\people0808(2).sqlite", "people");
		dbCommon.insertData(new People(name, favoriteColor, address));
		return "done";
	}
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\people0808(2).sqlite", "people");
		People details = dbCommon.detailsData(new People(), idx);
		if (details != null) {
			model.addAttribute("idx_value", details.idx);
			model.addAttribute("name_value", details.name);
			model.addAttribute("color_value", details.favoriteColor);
			model.addAttribute("address_value", details.address);
		}
		return "modify";
	}
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(@RequestParam("idx") int idx, @RequestParam("name") String name, @RequestParam("favoriteColor") String favoriteColor, @RequestParam("address") String address) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\people0808(2).sqlite", "people");
		dbCommon.updateData(new People(name, favoriteColor, address), idx);
		return "done";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("idx") int idx) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\people0808(2).sqlite", "people");
		dbCommon.deleteData(new People(), idx);
		return "done2";
	}
}
