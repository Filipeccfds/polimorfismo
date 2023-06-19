package com.filipe.polimofirmo_herana_classe_abstrata

class ClasseAbstrata {
}

fun main(){
    var goalKepper = Jogador()
    goalKepper.name = "taffarel"
    goalKepper.email = "taffarel@gmail.com"
    goalKepper.counted = 10

    println(goalKepper.rating())
    println(goalKepper.isAGoodPlayer())
}

abstract class Pessoa{
    abstract var name:String
    abstract var email:String
    abstract fun rating():Int

    fun isAGoodPlayer():Boolean{
        return  rating() > 5
    }
}

class Jogador: Pessoa(){
    override var name = ""
    override var email = ""
    var counted = 0

    override fun rating() = when{
        counted > 10 -> 2
        counted > 5 -> 10
        else -> 10
    }
}