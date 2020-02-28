package com.cts.adb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Stage02AdbContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stage02AdbContactServiceApplication.class, args);
	}

}
