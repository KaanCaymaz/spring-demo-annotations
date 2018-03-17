package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
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
