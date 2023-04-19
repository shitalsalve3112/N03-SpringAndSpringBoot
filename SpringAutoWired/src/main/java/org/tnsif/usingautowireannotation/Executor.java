package org.tnsif.usingautowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//program to demonstrate on Autowire example using @Autowired annotation
public class Executor {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Web.xml");
		Remote r = c.getBean("remote", Remote.class);
		r.remote();
	}

}
