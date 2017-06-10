package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("inside-doMyStartupStuff");
	}
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("inside-doMyCleanupStuff");
	}
	
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
