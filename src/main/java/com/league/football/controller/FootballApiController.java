package com.league.football.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.league.football.api.FootballApi;
import com.league.football.models.StandingsTeamDetails;
import com.league.football.repository.ValidateRequestRepository;
import com.league.football.service.IGetStandingsPositionService;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-29T05:53:15.206Z")

@Controller
public class FootballApiController implements FootballApi {

    private static final Logger log = LoggerFactory.getLogger(FootballApiController.class);

    private final HttpServletRequest request;
    
    @Autowired
    IGetStandingsPositionService getStandingsPositionService;
    
    @Autowired
    ValidateRequestRepository validateRequestRepository;

    @Autowired
    public FootballApiController(HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<List<StandingsTeamDetails>> getTeamStandingPosition(
    		@NotNull @ApiParam(value = "Action name", required = true, allowableValues = "get_standings, get_players, get_teams") @Valid @RequestParam(value = "action", required = true) String action,
    		@ApiParam(value = "Team name", required = false) @Valid @RequestParam(value = "teamName", required = false) String teamName,
    		@ApiParam(value = "League Name", required = false) @Valid @RequestParam(value = "leagueName", required = false) String leagueName,
    		@ApiParam(value = "Country name", required = false) @Valid @RequestParam(value = "countryName", required = false) String countryName,
    		@NotNull @ApiParam(value = "API key", required = true) @Valid @RequestParam(value = "APIkey", required = true) String apIkey,
    		@ApiParam(value = "League") @Valid @RequestParam(value = "leagueId", required = false) String leagueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	if(!validateRequestRepository.isRequestValid(apIkey)) 
            		return new ResponseEntity<List<StandingsTeamDetails>>(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED); 
            	
            	List<StandingsTeamDetails> standingTeamList = 
            			getStandingsPositionService.getStandingsPositionDetails(action, countryName, teamName, leagueName);
            	
            	if(null != standingTeamList && standingTeamList.size() > 0) {
            		return new ResponseEntity<List<StandingsTeamDetails>>(standingTeamList, HttpStatus.OK);
            	}
                } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<StandingsTeamDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<StandingsTeamDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }

}
