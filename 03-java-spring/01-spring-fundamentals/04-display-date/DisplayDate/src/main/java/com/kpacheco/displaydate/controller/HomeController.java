package com.kpacheco.displaydate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("EEEEEEEE, 'the' dd 'of' MMMMM, YYYY");
		Date date = new Date();
		String currentDate = formatter.format(date);
		System.out.println(currentDate);
		model.addAttribute("date", currentDate);
		return "date.jsp";
	}
		@RequestMapping("/time")
		public String time(Model viewModel) {
			SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
			Date time = new Date();
			String currentTime = formatter.format(time);
			System.out.println(currentTime);
			viewModel.addAttribute("time", currentTime);
			return "time.jsp";
		

}
}
