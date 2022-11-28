package com.balu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.balu.springdemo.Coach;
import com.balu.springdemo.TennisCoach;

public class JavaConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean(TennisCoach.class);
		System.out.println(coach.getDailyFortune() +"\n"+ coach.getDailyWorkOut());
		context.close();
	}
}
