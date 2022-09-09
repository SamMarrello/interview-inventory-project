package com.inventorio.repositories

import org.ktorm.database.Database

fun dbconnect(): Database {
    val password = System.getenv("secrets.env")
    val database = Database.connect("jdbc:mysql://localhost:3306/ktorm", user = "root", password = password)

    return database;
}