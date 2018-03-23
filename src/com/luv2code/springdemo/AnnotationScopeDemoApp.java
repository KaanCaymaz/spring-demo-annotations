package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
	
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = theCoach.equals(alphaCoach);

		System.out.println("\nObject referance " + result);
		
		System.out.println("\n Object " + theCoach);
		System.out.println("\n Object" + alphaCoach);
		
		System.out.println("\nDailyFortune "+ theCoach.getDailyFortune());
		System.out.println("\nDaiyFortune " + alphaCoach.getDailyFortune());
		
		context.close();
	}

}
