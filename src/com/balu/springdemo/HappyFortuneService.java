package com.balu.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component	
@Primary
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Today is your luck day!";
	}

}
