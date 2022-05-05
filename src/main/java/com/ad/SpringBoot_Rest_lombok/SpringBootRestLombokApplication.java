package com.ad.SpringBoot_Rest_lombok;

import com.ad.SpringBoot_Rest_lombok.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestLombokApplication.class, args);
		Student std = new Student();
		std.setFname("Ayesh");
		std.setLname("Dulanja");
		std.setId(1);
	}
}
