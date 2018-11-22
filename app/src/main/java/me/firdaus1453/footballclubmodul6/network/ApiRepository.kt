package me.firdaus1453.footballclubmodul6.network

import android.net.Uri
import me.firdaus1453.footballclubmodul6.BuildConfig
import java.net.URL

class ApiRepository {

    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}
