package com.msa.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaApplication.class, args);

		System.out.println("je suis dans msa");
	}

}
