package com.wissen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Configuration
public class Config {

	@Bean
	public Pageable getPageable()
	{
		return PageRequest.of(0, 1);
	}
}
