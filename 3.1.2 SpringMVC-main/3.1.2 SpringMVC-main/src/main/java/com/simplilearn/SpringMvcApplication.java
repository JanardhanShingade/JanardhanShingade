package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appCon = SpringApplication.run(SpringMvcApplication.class, args);
		
		/*appCon.start();
		
		appCon.stop();*/
	
	}

}
