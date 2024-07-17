package com.spring.formapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class FormapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormapiApplication.class, args);
	}

	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@SuppressWarnings("null")
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200","http://127.0.0.1:5500",
						"http://localhost:8080").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

}
