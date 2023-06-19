package com.filipe.polimofirmo_herana_classe_abstrata

class Interface {
}

fun main(){
    var atacante = Atacante()
    atacante.nome = "tiago"
    atacante.contando = 12
    println(atacante.rating())
    println(atacante.isGoodPlayer())

}

interface Humano{
    var nome:String
    val age:String
        get() = "18"
    fun rating():Int

    fun isGoodPlayer(){
        if (rating()> 5){
            println("e o um bom atacante")
        }
    }

}

class Atacante:Humano {
    override var nome = ""
    var contando = 0


    override fun rating(): Int {
        return    when{
                contando > 5 -> 10
                contando < 4 -> 2
                else -> 0
            }
    }



}