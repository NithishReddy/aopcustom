package com.example.aopcustom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopcustomApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopcustomApplication.class, args);
	}

}
