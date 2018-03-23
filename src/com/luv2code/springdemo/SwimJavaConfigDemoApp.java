package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(coach.getDailyworkout());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getMail());
		System.out.println(coach.getTeam());
		
		context.close();

	}

}
