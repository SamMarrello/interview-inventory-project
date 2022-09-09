package com.inventorio.controllers

import com.inventorio.models.User
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.index() {
    route("/") {
        get {
            val title = "Inventorio"
            val sample = User(1, "Sam", "yeet")
            call.respond(FreeMarkerContent("index.ftl", mapOf("user" to sample, "title" to title)))
        }
        post {

        }
    }
}

fun Route.orders() {
    route("/orders") {

    }
}

fun Route.login() {
    route("/users") {

    }
}

