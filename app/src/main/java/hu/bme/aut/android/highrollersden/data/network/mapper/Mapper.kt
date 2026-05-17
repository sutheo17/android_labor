package hu.bme.aut.android.highrollersden.data.network.mapper

import hu.bme.aut.android.highrollersden.data.local.entities.MatchEntity
import hu.bme.aut.android.highrollersden.data.network.dto.MatchDto

fun MatchDto.asEntity() = MatchEntity(
    eventKey = event_key,
    eventDate = event_date,
    eventTime = event_time,
    homeTeamName = event_home_team,
    awayTeamName = event_away_team,
    finalResult = event_final_result,
    leagueKey = league_key,
    awayTeamLogo = away_team_logo,
    homeTeamLogo =  home_team_logo,
    halfTimeResult =  event_halftime_result
)