package com.balu.springdemo;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("sadFortuneService")
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you have to work hard!";
	}

}
