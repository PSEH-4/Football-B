package com.league.football.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.league.football.FootballApplication;
import com.league.football.models.StandingsTeamDetails;
import com.league.football.repository.ValidateRequestRepository;
import com.league.football.service.IGetStandingsPositionService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FootballApplication.class)
@ActiveProfiles("test")
@WebAppConfiguration
public class FootballApiControllerTest {
	
	@InjectMocks
    FootballApiController footballApiControllerMock;
	
	@Mock
    IGetStandingsPositionService getStandingsPositionService;
    
	@Mock
    ValidateRequestRepository validateRequestRepository;
	
	@Test
	public void testShouldCallControllerAPIEndpointAndVerify() {
		StandingsTeamDetails standingTeam = new StandingsTeamDetails();
		standingTeam.setCountryName("England");
		standingTeam.setTeamName("Liverpool");
		standingTeam.setTeamId("TM123");
		standingTeam.setLeagueId("LG123");
		List<StandingsTeamDetails> standingTeamList = new ArrayList<>();
		standingTeamList.add(standingTeam);
		when(validateRequestRepository.isRequestValid(any(String.class))).thenReturn(true);
		when(getStandingsPositionService.getStandingsPositionDetails(any(String.class), any(String.class), any(String.class), any(String.class))).thenReturn(standingTeamList);
		
		ResponseEntity<List<StandingsTeamDetails>> standingList = footballApiControllerMock.getTeamStandingPosition("action", "teamName", "leagueName", "countryName", "apIkey", "leagueId");
		assertEquals("England", standingList.getBody().get(0).getCountryName());
		
	}
}
