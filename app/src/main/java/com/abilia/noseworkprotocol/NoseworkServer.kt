package com.abilia.noseworkprotocol

import com.google.gson.Gson
import java.net.URL

class NoseworkServer {

    // https://developer.android.com/training/basics/network-ops/connecting

    private val server = "http://localhost:8080/api/"
    private val objectMapper = Gson()

    fun getProtocol(id: Int): Protocol {
        val data = readUrl("protocols/${id}")
        return objectMapper.fromJson(String(data), Protocol::class.java)
    }

    private fun readUrl(url: String): ByteArray = URL("$server$url").readBytes()
}