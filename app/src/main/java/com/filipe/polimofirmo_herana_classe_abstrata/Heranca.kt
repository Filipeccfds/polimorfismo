package com.filipe.polimofirmo_herana_classe_abstrata

class Heranca {
}

fun main() {
    var pessoa = Person()
    var jogador = Player()

    pessoa.email = "joao@gmail.com"
    pessoa.name = "joao"

    jogador.number = 12
    jogador.email = "rorigo@gmail.com"
    jogador.name = "rodrigo"

    println(pessoa.toString())
    println(jogador.toString())

    var copyJogador: Person = jogador
    // funciona pois jogador herdar de pessoa se fosse ao contrario nao funcionario pois a superclasse person
    //nao conhece a classe jogador mais como jogador herdar de person ela sim conhece
    println(copyJogador.toString())


    if(jogador is Person){
        println("eu sou uma pessoa")
    }

}

open class Person{
    var name    = ""
    var email = ""

    override fun toString() = "name: ${this.name}, email: ${this.email}"

}

class Player: Person(){
    var number = 0

    override fun toString() = "${super.toString()} number: ${this.number}"
}