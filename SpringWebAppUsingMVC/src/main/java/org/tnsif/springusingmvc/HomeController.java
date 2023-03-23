package org.tnsif.springusingmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
	@RequestMapping("/home")
	public  String home()
	{ 
		System.out.println("Code to demonstrate on Simple web Application");
		return "home.jsp";
	}
	
	
}
