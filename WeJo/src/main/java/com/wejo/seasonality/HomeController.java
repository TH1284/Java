package com.wejo.seasonality;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wejo.seasonality.Seasonality;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		DBCommon dbCommon = new DBCommon("finalseasonalitydata4");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Seasonality()));
		System.out.println("작동확인");
		return "list";
	}
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputdata(@RequestParam("REGIONSEG1") String REGIONSEG1, @RequestParam("PRODUCTSEG2") String PRODUCTSEG2, @RequestParam("REGIONSEG2") String REGIONSEG2,@RequestParam("REGIONSEG3") String REGIONSEG3,@RequestParam("PRODUCTSEG3") String PRODUCTSEG3,@RequestParam("YEARWEEK") int YEARWEEK,@RequestParam("YEAR") int YEAR,@RequestParam("WEEK") int WEEK,@RequestParam("QTY") double QTY,@RequestParam("MA") double MA,@RequestParam("SEASONALITY") double SEASONALITY,@RequestParam("FCST") double FCST,@RequestParam("NEW_SEASONALITY") double NEW_SEASONALITY,@RequestParam("NEW_FCST") double NEW_FCST) {
		DBCommon<Seasonality> dbCommon = new DBCommon<Seasonality>("finalseasonalitydata4");
		dbCommon.insertData(new Seasonality(REGIONSEG1, PRODUCTSEG2, REGIONSEG2, REGIONSEG3, PRODUCTSEG3, YEARWEEK, YEAR, WEEK, QTY, MA, SEASONALITY, FCST, NEW_SEASONALITY, NEW_FCST));
		return "done";
	}
}
