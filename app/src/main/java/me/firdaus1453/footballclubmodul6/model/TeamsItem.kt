package me.firdaus1453.footballclubmodul6.model

import com.google.gson.annotations.SerializedName

data class TeamsItem(
	@SerializedName("idTeam")
	var teamId: String? = null,

	@SerializedName("strTeam")
	var teamName: String? = null,

	@SerializedName("strTeamBadge")
	var teamBadge: String? = null
)
