package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	
	private String[] data = new String[] {
			"Hadi oradan",
			"Vur joker vur",
			"Ko� emrah ko�"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return data[myRandom.nextInt(data.length)];
	}

}
