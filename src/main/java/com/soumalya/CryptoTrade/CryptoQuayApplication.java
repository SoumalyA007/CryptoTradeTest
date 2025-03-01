package com.soumalya.CryptoTrade;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class CryptoQuayApplication {

    public static void main(String[] args) {
        // Load environment variables from .env only if not set in System.getenv()
        Dotenv dotenv = Dotenv.configure().ignoreIfMalformed().ignoreIfMissing().load();

        Properties props = System.getProperties();

        dotenv.entries().forEach(entry -> {
            String key = entry.getKey();
            // Only set property if not already present in System.getenv()
            if (System.getenv(key) == null) {
                props.setProperty(key, entry.getValue());
            }
        });

        SpringApplication.run(CryptoQuayApplication.class, args);
    }
}
