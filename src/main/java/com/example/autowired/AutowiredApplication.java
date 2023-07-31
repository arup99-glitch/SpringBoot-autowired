package com.example.autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowiredApplication {

	public static void main(String[] args) {
		CreatureInfo creatureInfo=SpringApplication.run(AutowiredApplication.class, args).getBean(CreatureInfo.class);
		creatureInfo.setInfo("Positive","Own","Unlimited");
		creatureInfo.print();
	}

}
