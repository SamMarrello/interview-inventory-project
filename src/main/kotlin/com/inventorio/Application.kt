package com.inventorio

import com.inventorio.controllers.index
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.inventorio.plugins.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "localhost") {
        configureSecurity()
        configureMonitoring()
        configureTemplating()
        configureSerialization()
        configureRouting()
        routing {
            index()

        }
    }.start(wait = true)
}
