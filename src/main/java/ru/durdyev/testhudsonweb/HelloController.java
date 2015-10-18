package ru.durdyev.testhudsonweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ResourceBundle;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		ResourceBundle bundle = ResourceBundle.getBundle("version");
		model.addAttribute("message", "Hello world!");
		model.addAttribute("version", bundle.getString("version"));
		return "hello";
	}
}