# Football-B

Develop, Test and Deploy a microservice to find standings of a team playing league football match using country name, league name and team name. The service should be accessible via web browser on internet and end user should be able to view results by changing previously listed parameters. Output of this service should be presented in web browser using any one of Javascript framework, HTML or JSON. And the service should be ready to be released to production or live environment. In output, display following:
•	Country ID & Name: (<ID>) - <name>
•	League ID & Name: (<ID>) - <name>
•	Team ID & Name: (<ID>) - <name>
•	Overall League Position: <position>


Standings

Method
GET apiv2.apifootball.com/?action=get_standings

Returns standings for leagues included in your current subscription plan


Parameters
Parameter	Description
action	API method name
APIkey	Authorization code generated from your apifootball account
league_id	League internal code
Request URL
https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey=xxxxxxxxxxxxxx

JSON Response
[
  {
    "country_name": "England",
    "league_id": "148",
    "league_name": "Premier League",
    "team_id": "2626",
    "team_name": "Manchester City",
    "overall_league_position": "1",
    "overall_league_payed": "38",
    "overall_league_W": "32",
    "overall_league_D": "2",
    "overall_league_L": "4",
    "overall_league_GF": "95",
    "overall_league_GA": "23",
    "overall_league_PTS": "98",
    "home_league_position": "1",
    "home_league_payed": "19",
    "home_league_W": "18",
    "home_league_D": "0",
    "home_league_L": "1",
    "home_league_GF": "57",
    "home_league_GA": "12",
    "home_league_PTS": "54",
    "away_league_position": "1",
    "away_league_payed": "19",
    "away_league_W": "14",
    "away_league_D": "2",
    "away_league_L": "3",
    "away_league_GF": "38",
    "away_league_GA": "11",
    "away_league_PTS": "44"
  },
  {
    "country_name": "England",
    "league_id": "148",
    "league_name": "Premier League",
    "team_id": "2621",
    "team_name": "Liverpool",
    "overall_league_position": "2",
    "overall_league_payed": "38",
    "overall_league_W": "30",
    "overall_league_D": "7",
    "overall_league_L": "1",
    "overall_league_GF": "89",
    "overall_league_GA": "22",
    "overall_league_PTS": "97",
    "home_league_position": "2",
    "home_league_payed": "19",
    "home_league_W": "17",
    "home_league_D": "2",
    "home_league_L": "0",
    "home_league_GF": "55",
    "home_league_GA": "10",
    "home_league_PTS": "53",
    "away_league_position": "2",
    "away_league_payed": "19",
    "away_league_W": "13",
    "away_league_D": "5",
    "away_league_L": "1",
    "away_league_GF": "34",
    "away_league_GA": "12",
    "away_league_PTS": "44"
  },
  ......
]
            
