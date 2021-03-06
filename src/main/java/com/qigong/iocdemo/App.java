package com.qigong.iocdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class App {
	public static void main(String[] args) {
		bossGoSomewhere();
		smartBossGoSomewhere();
	}
	
	static void bossGoSomewhere() {
		Boss boss = new Boss();
		boss.goSomewhere();
	}
	
	static void smartBossGoSomewhere() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		try {
			SmartBoss boss = context.getBean(SmartBoss.class);
			boss.goSomewhere();
		} finally {
			context.close();
		}
	}
}


