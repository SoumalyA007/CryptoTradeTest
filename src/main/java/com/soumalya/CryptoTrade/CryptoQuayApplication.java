package com.soumalya.CryptoTrade;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class CryptoQuayApplication {

	public static void main(String[] args) {
		// Load environment variables from .env file
		Dotenv dotenv = Dotenv.load();

		// Set system properties from .env
		Properties props = System.getProperties();
		dotenv.entries().forEach(entry -> props.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(CryptoQuayApplication.class, args);
	}

}
