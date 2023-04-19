package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * A controller contains the business logic of an application.
 * @Controller annotations is used to mark the class as a controller
 * */
@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Code to demonstrate on simple web application");
		return "home.jsp";
	}
}
