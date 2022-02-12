package com.example.myproject

class Timer(var hours: Int, var minutes: Int, var seconds: Int) {

    fun getTime() {
        var hours = if (hours in 0..59) hours else 0
        var minutes = if (minutes in 0..59) minutes else 0
        var seconds = if (seconds in 0..59) seconds else 0
        println("$hours : $minutes : $seconds")
    }

    fun setHours() {
//        var h = readLine()?.toInt()
//        println("Введите часы")
        var newHours = hours + 2
        if (newHours in 0..59) {
            hours = newHours
            println("$hours : $minutes : $seconds")
        } else
            println("0")
    }

    fun setMinutes() {
//        var h = readLine()?.toInt()
//        println("Введите часы")
        var newMinutes = minutes + 20
        if (newMinutes in 0..59) {
            minutes = newMinutes
            println("$hours : $minutes : $seconds")
        } else
            println("0")
    }

    fun setSeconds() {
//        var h = readLine()?.toInt()
//        println("Введите часы")
        var setSeconds = seconds + 10
        if (setSeconds in 0..59) {
            seconds = setSeconds
            println("$hours : $minutes : $seconds")
        } else
            println("0")
    }
}
