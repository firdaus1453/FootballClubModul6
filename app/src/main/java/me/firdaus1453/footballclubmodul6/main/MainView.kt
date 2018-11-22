package me.firdaus1453.footballclubmodul6.main

import me.firdaus1453.footballclubmodul6.model.TeamsItem

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<TeamsItem>)
}
