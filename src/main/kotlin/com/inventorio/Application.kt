package com.inventorio

import com.inventorio.controllers.index
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.inventorio.plugins.*
import com.inventorio.repositories.dbconnection
import io.ktor.http.ContentDisposition.Companion.File
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import java.io.File

fun main() {
    embeddedServer(Netty, port = 8080, host = "localhost") {
        configureSecurity()
        configureMonitoring()
        configureTemplating()
        configureSerialization()
        configureRouting()
        val database = dbconnection()
        routing {
            index()
        }
    }.start(wait = true)
}
