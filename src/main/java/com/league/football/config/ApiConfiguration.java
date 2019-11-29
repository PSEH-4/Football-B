package com.league.football.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {
	
	@Value("${api.token.key}")
	public String apiTokenKey;
	
	
}
