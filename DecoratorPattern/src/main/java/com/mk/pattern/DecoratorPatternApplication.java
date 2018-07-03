package com.mk.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mk.pattern.component.Expesso;
import com.mk.pattern.decorator.Caramel;

@SpringBootApplication
public class DecoratorPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorPatternApplication.class, args);
		Expesso expesso = new Expesso();
		Caramel caramel = new Caramel(expesso);
		System.out.println(caramel.getDescription());
		System.out.println(caramel.cost());
	}
}
