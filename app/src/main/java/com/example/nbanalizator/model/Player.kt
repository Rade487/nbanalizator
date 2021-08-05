package com.example.nbanalizator.model

data class Player (
    val id : Long = 0,
    val name : String = "",
    val team : String = "",
    val opponent : String = "",
    val bookmakers : List<String>
)