package com.datnguyen.PhishingDetection;

import com.datnguyen.PhishingDetection.database.MySQLConnectionTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EntityScan(basePackages = "com.datnguyen.PhishingDetection.database")
public class PhishingDetectionApplication {
	public static void main(String[] args) {
		SpringApplication.run(PhishingDetectionApplication.class, args);
	}
}
