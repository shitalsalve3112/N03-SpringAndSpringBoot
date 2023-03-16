package org.tnsif.objectsInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tnsif.Literals.SwiftEngine;

public class DIUsingObject {

	 public static void main(String[]args) {
		 
		 BeanFactory f= new ClassPathXmlApplicationContext("web.xml");
			Cellphone e=f.getBean("c2",Cellphone.class);
			e.accept();
	 }
	}

