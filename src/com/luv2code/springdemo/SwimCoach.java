package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.mail}")
	private String mail;
	
	@Value("${foo.team}")
	private String team;
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	
	@Override
	public String getDailyworkout() {
		return "swim 1000 meter. ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
