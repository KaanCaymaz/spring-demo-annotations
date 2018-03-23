package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class TennisCoach implements Coach {


	private FortuneService fortuneService;
	
	@Autowired  
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}*/
	
	public TennisCoach() {
		System.out.println("\n Defoult Constructer method: ");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("\n StartMethod");
		
	}
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("\n Destroy Method");
	}
	
	@Override
	public String getDailyworkout() {
		return "Practice your backend volley.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
