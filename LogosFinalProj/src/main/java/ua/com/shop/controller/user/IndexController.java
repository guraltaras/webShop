package ua.com.shop.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "user-index";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "admin-admin";
	}

	@RequestMapping("/user/registration")
	public String registration() {
		return "user-registration";
	}

//	@RequestMapping("/user/next")
//	public String registratio1n() {
//		return "user-next";
//	}
}
