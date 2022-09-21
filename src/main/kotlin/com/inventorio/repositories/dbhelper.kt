package com.inventorio.repositories

import org.jetbrains.exposed.sql.Database

fun dbconnection(): Database {
    val host = "localhost"
    val port = 5555
    val dbName = "inventorio_db"
    val dbUser = "inventorio_user"
    val password = "password123!"

    val db = Database.connect("jdbc:postgresql://$host:$port/$dbName", driver = "org.postgresql.Driver",
                                user = dbUser, password = password)

    return db
}