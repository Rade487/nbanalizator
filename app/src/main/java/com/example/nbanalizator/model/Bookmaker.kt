package com.example.nbanalizator.model

data class Bookmaker (
    val id : Long = 0,
    val name : String = "",
    val logo : String = "",
    val margin : Float = 0f,
    val underBet : Float = 0f,
    val overBet : Float = 0f

)