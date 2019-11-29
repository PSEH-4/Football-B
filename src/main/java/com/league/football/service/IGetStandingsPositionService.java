package com.league.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.league.football.models.StandingsTeamDetails;

@Service
public interface IGetStandingsPositionService {
	
	public List<StandingsTeamDetails> getStandingsPositionDetails(String actionName, String countryName,
			String teamName, String leagueName);

}
