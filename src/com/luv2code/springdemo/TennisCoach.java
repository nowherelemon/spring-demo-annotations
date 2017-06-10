package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
	/*
	@Autowired
	public void giveMyFortune(FortuneService fortuneService) {
		//this.fortuneService = fortuneService;
		System.out.println("this is crazy");
	}
	
	@Autowired
	public void SetFortuneService(FortuneService fortuneService) {
		//this.fortuneService = fortuneService;
		System.out.println("this is crazy2");
	}
	*/
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "xttgoodgood";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
