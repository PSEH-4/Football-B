package com.league.football.models;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StandingsTeamDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-29T05:53:15.206Z")

public class StandingsTeamDetails   {
  @JsonProperty("country_name")
  private String countryName = null;

  @JsonProperty("league_id")
  private String leagueId = null;

  @JsonProperty("league_name")
  private String leagueName = null;

  @JsonProperty("team_id")
  private String teamId = null;

  @JsonProperty("team_name")
  private String teamName = null;

  @JsonProperty("overall_league_position")
  private String overallLeaguePosition = null;

  @JsonProperty("overall_league_payed")
  private String overallLeaguePayed = null;

  @JsonProperty("overall_league_W")
  private String overallLeagueW = null;

  @JsonProperty("overall_league_D")
  private String overallLeagueD = null;

  @JsonProperty("overall_league_L")
  private String overallLeagueL = null;

  @JsonProperty("overall_league_GF")
  private String overallLeagueGF = null;

  @JsonProperty("overall_league_GA")
  private String overallLeagueGA = null;

  @JsonProperty("overall_league_PTS")
  private String overallLeaguePTS = null;

  @JsonProperty("home_league_position")
  private String homeLeaguePosition = null;

  @JsonProperty("home_league_payed")
  private String homeLeaguePayed = null;

  @JsonProperty("home_league_W")
  private String homeLeagueW = null;

  @JsonProperty("home_league_D")
  private String homeLeagueD = null;

  @JsonProperty("home_league_L")
  private String homeLeagueL = null;

  @JsonProperty("home_league_GF")
  private String homeLeagueGF = null;

  @JsonProperty("home_league_GA")
  private String homeLeagueGA = null;

  @JsonProperty("home_league_PTS")
  private String homeLeaguePTS = null;

  @JsonProperty("away_league_position")
  private String awayLeaguePosition = null;

  @JsonProperty("away_league_payed")
  private String awayLeaguePayed = null;

  @JsonProperty("away_league_W")
  private String awayLeagueW = null;

  @JsonProperty("away_league_D")
  private String awayLeagueD = null;

  @JsonProperty("away_league_L")
  private String awayLeagueL = null;

  @JsonProperty("away_league_GF")
  private String awayLeagueGF = null;

  @JsonProperty("away_league_GA")
  private String awayLeagueGA = null;

  @JsonProperty("away_league_PTS")
  private String awayLeaguePTS = null;

  public StandingsTeamDetails countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Get countryName
   * @return countryName
  **/
  @ApiModelProperty(value = "")


  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public StandingsTeamDetails leagueId(String leagueId) {
    this.leagueId = leagueId;
    return this;
  }

  /**
   * Get leagueId
   * @return leagueId
  **/
  @ApiModelProperty(value = "")


  public String getLeagueId() {
    return leagueId;
  }

  public void setLeagueId(String leagueId) {
    this.leagueId = leagueId;
  }

  public StandingsTeamDetails leagueName(String leagueName) {
    this.leagueName = leagueName;
    return this;
  }

  /**
   * Get leagueName
   * @return leagueName
  **/
  @ApiModelProperty(value = "")


  public String getLeagueName() {
    return leagueName;
  }

  public void setLeagueName(String leagueName) {
    this.leagueName = leagueName;
  }

  public StandingsTeamDetails teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
  **/
  @ApiModelProperty(value = "")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public StandingsTeamDetails teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Get teamName
   * @return teamName
  **/
  @ApiModelProperty(value = "")


  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public StandingsTeamDetails overallLeaguePosition(String overallLeaguePosition) {
    this.overallLeaguePosition = overallLeaguePosition;
    return this;
  }

  /**
   * Get overallLeaguePosition
   * @return overallLeaguePosition
  **/
  @ApiModelProperty(value = "")


  public String getOverallLeaguePosition() {
    return overallLeaguePosition;
  }

  public void setOverallLeaguePosition(String overallLeaguePosition) {
    this.overallLeaguePosition = overallLeaguePosition;
  }

  public StandingsTeamDetails overallLeaguePayed(String overallLeaguePayed) {
    this.overallLeaguePayed = overallLeaguePayed;
    return this;
  }

  /**
   * Get overallLeaguePayed
   * @return overallLeaguePayed
  **/
  @ApiModelProperty(value = "")


  public String getOverallLeaguePayed() {
    return overallLeaguePayed;
  }

  public void setOverallLeaguePayed(String overallLeaguePayed) {
    this.overallLeaguePayed = overallLeaguePayed;
  }

  public StandingsTeamDetails overallLeagueW(String overallLeagueW) {
    this.overallLeagueW = overallLeagueW;
    return this;
  }

  /**
   * Get overallLeagueW
   * @return overallLeagueW
  **/
  @ApiModelProperty(value = "")


  public String getOverallLeagueW() {
    return overallLeagueW;
  }

  public void setOverallLeagueW(String overallLeagueW) {
    this.overallLeagueW = overallLeagueW;
  }

  public StandingsTeamDetails overallLeagueD(String overallLeagueD) {
    this.overallLeagueD = overallLeagueD;
    return this;
  }

  /**
   * Get overallLeagueD
   * @return overallLeagueD
  **/
  @ApiModelProperty(value = "")


  public String getOverallLeagueD() {
    return overallLeagueD;
  }

  public void setOverallLeagueD(String overallLeagueD) {
    this.overallLeagueD = overallLeagueD;
  }

  public StandingsTeamDetails overallLeagueL(String overallLeagueL) {
    this.overallLeagueL = overallLeagueL;
    return this;
  }

  /**
   * Get overallLeagueL
   * @return overallLeagueL
  **/
  @ApiModelProperty(value = "")


  public String getOverallLeagueL() {
    return overallLeagueL;
  }

  public void setOverallLeagueL(String overallLeagueL) {
    this.overallLeagueL = overallLeagueL;
  }

  public StandingsTeamDetails overallLeagueGF(String overallLeagueGF) {
    this.overallLeagueGF = overallLeagueGF;
    return this;
  }

  /**
   * Get overallLeagueGF
   * @return overallLeagueGF
  **/
  @ApiModelProperty(value = "")


  public String getOverallLeagueGF() {
    return overallLeagueGF;
  }

  public void setOverallLeagueGF(String overallLeagueGF) {
    this.overallLeagueGF = overallLeagueGF;
  }

  public StandingsTeamDetails overallLeagueGA(String overallLeagueGA) {
    this.overallLeagueGA = overallLeagueGA;
    return this;
  }

  /**
   * Get overallLeagueGA
   * @return overallLeagueGA
  **/
  @ApiModelProperty(value = "")


  public String getOverallLeagueGA() {
    return overallLeagueGA;
  }

  public void setOverallLeagueGA(String overallLeagueGA) {
    this.overallLeagueGA = overallLeagueGA;
  }

  public StandingsTeamDetails overallLeaguePTS(String overallLeaguePTS) {
    this.overallLeaguePTS = overallLeaguePTS;
    return this;
  }

  /**
   * Get overallLeaguePTS
   * @return overallLeaguePTS
  **/
  @ApiModelProperty(value = "")


  public String getOverallLeaguePTS() {
    return overallLeaguePTS;
  }

  public void setOverallLeaguePTS(String overallLeaguePTS) {
    this.overallLeaguePTS = overallLeaguePTS;
  }

  public StandingsTeamDetails homeLeaguePosition(String homeLeaguePosition) {
    this.homeLeaguePosition = homeLeaguePosition;
    return this;
  }

  /**
   * Get homeLeaguePosition
   * @return homeLeaguePosition
  **/
  @ApiModelProperty(value = "")


  public String getHomeLeaguePosition() {
    return homeLeaguePosition;
  }

  public void setHomeLeaguePosition(String homeLeaguePosition) {
    this.homeLeaguePosition = homeLeaguePosition;
  }

  public StandingsTeamDetails homeLeaguePayed(String homeLeaguePayed) {
    this.homeLeaguePayed = homeLeaguePayed;
    return this;
  }

  /**
   * Get homeLeaguePayed
   * @return homeLeaguePayed
  **/
  @ApiModelProperty(value = "")


  public String getHomeLeaguePayed() {
    return homeLeaguePayed;
  }

  public void setHomeLeaguePayed(String homeLeaguePayed) {
    this.homeLeaguePayed = homeLeaguePayed;
  }

  public StandingsTeamDetails homeLeagueW(String homeLeagueW) {
    this.homeLeagueW = homeLeagueW;
    return this;
  }

  /**
   * Get homeLeagueW
   * @return homeLeagueW
  **/
  @ApiModelProperty(value = "")


  public String getHomeLeagueW() {
    return homeLeagueW;
  }

  public void setHomeLeagueW(String homeLeagueW) {
    this.homeLeagueW = homeLeagueW;
  }

  public StandingsTeamDetails homeLeagueD(String homeLeagueD) {
    this.homeLeagueD = homeLeagueD;
    return this;
  }

  /**
   * Get homeLeagueD
   * @return homeLeagueD
  **/
  @ApiModelProperty(value = "")


  public String getHomeLeagueD() {
    return homeLeagueD;
  }

  public void setHomeLeagueD(String homeLeagueD) {
    this.homeLeagueD = homeLeagueD;
  }

  public StandingsTeamDetails homeLeagueL(String homeLeagueL) {
    this.homeLeagueL = homeLeagueL;
    return this;
  }

  /**
   * Get homeLeagueL
   * @return homeLeagueL
  **/
  @ApiModelProperty(value = "")


  public String getHomeLeagueL() {
    return homeLeagueL;
  }

  public void setHomeLeagueL(String homeLeagueL) {
    this.homeLeagueL = homeLeagueL;
  }

  public StandingsTeamDetails homeLeagueGF(String homeLeagueGF) {
    this.homeLeagueGF = homeLeagueGF;
    return this;
  }

  /**
   * Get homeLeagueGF
   * @return homeLeagueGF
  **/
  @ApiModelProperty(value = "")


  public String getHomeLeagueGF() {
    return homeLeagueGF;
  }

  public void setHomeLeagueGF(String homeLeagueGF) {
    this.homeLeagueGF = homeLeagueGF;
  }

  public StandingsTeamDetails homeLeagueGA(String homeLeagueGA) {
    this.homeLeagueGA = homeLeagueGA;
    return this;
  }

  /**
   * Get homeLeagueGA
   * @return homeLeagueGA
  **/
  @ApiModelProperty(value = "")


  public String getHomeLeagueGA() {
    return homeLeagueGA;
  }

  public void setHomeLeagueGA(String homeLeagueGA) {
    this.homeLeagueGA = homeLeagueGA;
  }

  public StandingsTeamDetails homeLeaguePTS(String homeLeaguePTS) {
    this.homeLeaguePTS = homeLeaguePTS;
    return this;
  }

  /**
   * Get homeLeaguePTS
   * @return homeLeaguePTS
  **/
  @ApiModelProperty(value = "")


  public String getHomeLeaguePTS() {
    return homeLeaguePTS;
  }

  public void setHomeLeaguePTS(String homeLeaguePTS) {
    this.homeLeaguePTS = homeLeaguePTS;
  }

  public StandingsTeamDetails awayLeaguePosition(String awayLeaguePosition) {
    this.awayLeaguePosition = awayLeaguePosition;
    return this;
  }

  /**
   * Get awayLeaguePosition
   * @return awayLeaguePosition
  **/
  @ApiModelProperty(value = "")


  public String getAwayLeaguePosition() {
    return awayLeaguePosition;
  }

  public void setAwayLeaguePosition(String awayLeaguePosition) {
    this.awayLeaguePosition = awayLeaguePosition;
  }

  public StandingsTeamDetails awayLeaguePayed(String awayLeaguePayed) {
    this.awayLeaguePayed = awayLeaguePayed;
    return this;
  }

  /**
   * Get awayLeaguePayed
   * @return awayLeaguePayed
  **/
  @ApiModelProperty(value = "")


  public String getAwayLeaguePayed() {
    return awayLeaguePayed;
  }

  public void setAwayLeaguePayed(String awayLeaguePayed) {
    this.awayLeaguePayed = awayLeaguePayed;
  }

  public StandingsTeamDetails awayLeagueW(String awayLeagueW) {
    this.awayLeagueW = awayLeagueW;
    return this;
  }

  /**
   * Get awayLeagueW
   * @return awayLeagueW
  **/
  @ApiModelProperty(value = "")


  public String getAwayLeagueW() {
    return awayLeagueW;
  }

  public void setAwayLeagueW(String awayLeagueW) {
    this.awayLeagueW = awayLeagueW;
  }

  public StandingsTeamDetails awayLeagueD(String awayLeagueD) {
    this.awayLeagueD = awayLeagueD;
    return this;
  }

  /**
   * Get awayLeagueD
   * @return awayLeagueD
  **/
  @ApiModelProperty(value = "")


  public String getAwayLeagueD() {
    return awayLeagueD;
  }

  public void setAwayLeagueD(String awayLeagueD) {
    this.awayLeagueD = awayLeagueD;
  }

  public StandingsTeamDetails awayLeagueL(String awayLeagueL) {
    this.awayLeagueL = awayLeagueL;
    return this;
  }

  /**
   * Get awayLeagueL
   * @return awayLeagueL
  **/
  @ApiModelProperty(value = "")


  public String getAwayLeagueL() {
    return awayLeagueL;
  }

  public void setAwayLeagueL(String awayLeagueL) {
    this.awayLeagueL = awayLeagueL;
  }

  public StandingsTeamDetails awayLeagueGF(String awayLeagueGF) {
    this.awayLeagueGF = awayLeagueGF;
    return this;
  }

  /**
   * Get awayLeagueGF
   * @return awayLeagueGF
  **/
  @ApiModelProperty(value = "")


  public String getAwayLeagueGF() {
    return awayLeagueGF;
  }

  public void setAwayLeagueGF(String awayLeagueGF) {
    this.awayLeagueGF = awayLeagueGF;
  }

  public StandingsTeamDetails awayLeagueGA(String awayLeagueGA) {
    this.awayLeagueGA = awayLeagueGA;
    return this;
  }

  /**
   * Get awayLeagueGA
   * @return awayLeagueGA
  **/
  @ApiModelProperty(value = "")


  public String getAwayLeagueGA() {
    return awayLeagueGA;
  }

  public void setAwayLeagueGA(String awayLeagueGA) {
    this.awayLeagueGA = awayLeagueGA;
  }

  public StandingsTeamDetails awayLeaguePTS(String awayLeaguePTS) {
    this.awayLeaguePTS = awayLeaguePTS;
    return this;
  }

  /**
   * Get awayLeaguePTS
   * @return awayLeaguePTS
  **/
  @ApiModelProperty(value = "")


  public String getAwayLeaguePTS() {
    return awayLeaguePTS;
  }

  public void setAwayLeaguePTS(String awayLeaguePTS) {
    this.awayLeaguePTS = awayLeaguePTS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsTeamDetails standingsTeamDetails = (StandingsTeamDetails) o;
    return Objects.equals(this.countryName, standingsTeamDetails.countryName) &&
        Objects.equals(this.leagueId, standingsTeamDetails.leagueId) &&
        Objects.equals(this.leagueName, standingsTeamDetails.leagueName) &&
        Objects.equals(this.teamId, standingsTeamDetails.teamId) &&
        Objects.equals(this.teamName, standingsTeamDetails.teamName) &&
        Objects.equals(this.overallLeaguePosition, standingsTeamDetails.overallLeaguePosition) &&
        Objects.equals(this.overallLeaguePayed, standingsTeamDetails.overallLeaguePayed) &&
        Objects.equals(this.overallLeagueW, standingsTeamDetails.overallLeagueW) &&
        Objects.equals(this.overallLeagueD, standingsTeamDetails.overallLeagueD) &&
        Objects.equals(this.overallLeagueL, standingsTeamDetails.overallLeagueL) &&
        Objects.equals(this.overallLeagueGF, standingsTeamDetails.overallLeagueGF) &&
        Objects.equals(this.overallLeagueGA, standingsTeamDetails.overallLeagueGA) &&
        Objects.equals(this.overallLeaguePTS, standingsTeamDetails.overallLeaguePTS) &&
        Objects.equals(this.homeLeaguePosition, standingsTeamDetails.homeLeaguePosition) &&
        Objects.equals(this.homeLeaguePayed, standingsTeamDetails.homeLeaguePayed) &&
        Objects.equals(this.homeLeagueW, standingsTeamDetails.homeLeagueW) &&
        Objects.equals(this.homeLeagueD, standingsTeamDetails.homeLeagueD) &&
        Objects.equals(this.homeLeagueL, standingsTeamDetails.homeLeagueL) &&
        Objects.equals(this.homeLeagueGF, standingsTeamDetails.homeLeagueGF) &&
        Objects.equals(this.homeLeagueGA, standingsTeamDetails.homeLeagueGA) &&
        Objects.equals(this.homeLeaguePTS, standingsTeamDetails.homeLeaguePTS) &&
        Objects.equals(this.awayLeaguePosition, standingsTeamDetails.awayLeaguePosition) &&
        Objects.equals(this.awayLeaguePayed, standingsTeamDetails.awayLeaguePayed) &&
        Objects.equals(this.awayLeagueW, standingsTeamDetails.awayLeagueW) &&
        Objects.equals(this.awayLeagueD, standingsTeamDetails.awayLeagueD) &&
        Objects.equals(this.awayLeagueL, standingsTeamDetails.awayLeagueL) &&
        Objects.equals(this.awayLeagueGF, standingsTeamDetails.awayLeagueGF) &&
        Objects.equals(this.awayLeagueGA, standingsTeamDetails.awayLeagueGA) &&
        Objects.equals(this.awayLeaguePTS, standingsTeamDetails.awayLeaguePTS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryName, leagueId, leagueName, teamId, teamName, overallLeaguePosition, overallLeaguePayed, overallLeagueW, overallLeagueD, overallLeagueL, overallLeagueGF, overallLeagueGA, overallLeaguePTS, homeLeaguePosition, homeLeaguePayed, homeLeagueW, homeLeagueD, homeLeagueL, homeLeagueGF, homeLeagueGA, homeLeaguePTS, awayLeaguePosition, awayLeaguePayed, awayLeagueW, awayLeagueD, awayLeagueL, awayLeagueGF, awayLeagueGA, awayLeaguePTS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsTeamDetails {\n");
    
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
    sb.append("    leagueName: ").append(toIndentedString(leagueName)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    overallLeaguePosition: ").append(toIndentedString(overallLeaguePosition)).append("\n");
    sb.append("    overallLeaguePayed: ").append(toIndentedString(overallLeaguePayed)).append("\n");
    sb.append("    overallLeagueW: ").append(toIndentedString(overallLeagueW)).append("\n");
    sb.append("    overallLeagueD: ").append(toIndentedString(overallLeagueD)).append("\n");
    sb.append("    overallLeagueL: ").append(toIndentedString(overallLeagueL)).append("\n");
    sb.append("    overallLeagueGF: ").append(toIndentedString(overallLeagueGF)).append("\n");
    sb.append("    overallLeagueGA: ").append(toIndentedString(overallLeagueGA)).append("\n");
    sb.append("    overallLeaguePTS: ").append(toIndentedString(overallLeaguePTS)).append("\n");
    sb.append("    homeLeaguePosition: ").append(toIndentedString(homeLeaguePosition)).append("\n");
    sb.append("    homeLeaguePayed: ").append(toIndentedString(homeLeaguePayed)).append("\n");
    sb.append("    homeLeagueW: ").append(toIndentedString(homeLeagueW)).append("\n");
    sb.append("    homeLeagueD: ").append(toIndentedString(homeLeagueD)).append("\n");
    sb.append("    homeLeagueL: ").append(toIndentedString(homeLeagueL)).append("\n");
    sb.append("    homeLeagueGF: ").append(toIndentedString(homeLeagueGF)).append("\n");
    sb.append("    homeLeagueGA: ").append(toIndentedString(homeLeagueGA)).append("\n");
    sb.append("    homeLeaguePTS: ").append(toIndentedString(homeLeaguePTS)).append("\n");
    sb.append("    awayLeaguePosition: ").append(toIndentedString(awayLeaguePosition)).append("\n");
    sb.append("    awayLeaguePayed: ").append(toIndentedString(awayLeaguePayed)).append("\n");
    sb.append("    awayLeagueW: ").append(toIndentedString(awayLeagueW)).append("\n");
    sb.append("    awayLeagueD: ").append(toIndentedString(awayLeagueD)).append("\n");
    sb.append("    awayLeagueL: ").append(toIndentedString(awayLeagueL)).append("\n");
    sb.append("    awayLeagueGF: ").append(toIndentedString(awayLeagueGF)).append("\n");
    sb.append("    awayLeagueGA: ").append(toIndentedString(awayLeagueGA)).append("\n");
    sb.append("    awayLeaguePTS: ").append(toIndentedString(awayLeaguePTS)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

