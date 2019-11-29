package com.league.football.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ValidateRequestRepository {
	@Value("${api.token.key}")
	public String apiTokenKey;
	
	public boolean isRequestValid(String apiKey) {
		if(apiTokenKey.equalsIgnoreCase(apiKey)) {
			return true;
		}else {
			return false;
		}
	}

}
