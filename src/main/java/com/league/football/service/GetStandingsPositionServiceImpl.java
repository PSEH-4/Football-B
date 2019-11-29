package com.league.football.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.league.football.constants.UtilityConstants;
import com.league.football.models.StandingsTeamDetails;

@Service
public class GetStandingsPositionServiceImpl implements IGetStandingsPositionService{
	
	public final static String GET_STANDINGS = "get_standings";
	private static final Logger log = LoggerFactory.getLogger(GetStandingsPositionServiceImpl.class);
	
	 private final ObjectMapper objectMapper;
	    
	    @Autowired
	    IGetStandingsPositionService getStandingsPositionService;

	    @Autowired
	    public GetStandingsPositionServiceImpl(ObjectMapper objectMapper) {
	        this.objectMapper = objectMapper;
	    }

	@Override
	public List<StandingsTeamDetails> getStandingsPositionDetails(String actionName, String countryName,
			String teamName, String leagueName) {
		try {
			switch(actionName ) {
			
			case GET_STANDINGS:
				{
					return filterOnTeamName(countryName, teamName);
				    
				}
			default:
				{
					return null;
				}
			}
				
		}catch(Exception exc) {
			log.error("Exception occurred while parsing" + exc.getMessage());
			return null;
		}
		
		
	}
	
	private List<StandingsTeamDetails> filterOnTeamName(String countryName, String teamName) throws IOException{
		List<StandingsTeamDetails> teamStandingsDetails = null;
		if(countryName.equalsIgnoreCase("England")) {
				List<StandingsTeamDetails> teamDetails =
					objectMapper.readValue(UtilityConstants.GET_STANDINGS_RESPONSE_ENGLAND_LEAGUE_ID_148, List.class);
			if(null != teamName) {
				teamStandingsDetails = teamDetails.stream()
					.filter(p -> p.getTeamName().equalsIgnoreCase(teamName))
					.collect(Collectors.toCollection(() -> new ArrayList<StandingsTeamDetails>()));
			}else {
				teamStandingsDetails = teamDetails;
			}
		}else {
			return teamStandingsDetails;
		}
		return teamStandingsDetails;
		
	}
	

}
