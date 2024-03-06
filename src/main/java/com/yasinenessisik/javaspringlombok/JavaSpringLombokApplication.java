package com.yasinenessisik.javaspringlombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringLombokApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavaSpringLombokApplication.class, args);
		Person personwithlombok = new Person();
		PersonWithoutLombok personWithoutLombok = new PersonWithoutLombok();
		System.out.println(StringUtility.trim("value "));


	}

}
