package com.singhal.bs.configs;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javafx.util.Callback;

@Configuration
public class BeansConfig {
	
	@Bean
	public Callback<Class<?>, Object> controllerFactory(ConfigurableApplicationContext springContext) {
		return param -> springContext.getBean(param);
	}
	
}
