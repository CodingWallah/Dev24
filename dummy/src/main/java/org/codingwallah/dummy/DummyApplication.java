package org.codingwallah.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) {
		System.out.println("Hellow World");
		SpringApplication.run(DummyApplication.class, args);
	}

}
