package jee3060.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HobbiesApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(HobbiesApplication.class, args);

		//SpringApplication.run(HobbiesApplication.class, args);
	}

}
