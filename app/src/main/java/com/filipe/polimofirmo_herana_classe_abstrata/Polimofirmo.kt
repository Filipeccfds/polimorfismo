package com.filipe.polimofirmo_herana_classe_abstrata

class Polimofirmo {
}

fun main(){
   // val ant = Ant() //val lion = Lion()

    val factory = AnimalFactory()
    val animais:MutableList<Animal> = mutableListOf()   //(ant,lion)

    for (i in 1..100){
        val animal = factory.createAnAnimal(i % 2,i)
        animais.add(animal)
    }
    animais.forEach {
        animal ->   animal.feed()
                    animal.feed()
                    println(animal)
                    animal.play()
                    println(animal)
                    if (animal is Lion){
                        animal.roar()
                    }
    }


}
//usando factory
class AnimalFactory{
    fun createAnAnimal(type: Int,id: Int): Animal{
        return when(type){
            1 -> Ant(id)
            else -> Lion(id)
        }
    }
}

abstract class Animal(val id:Int){
   var energy:Int = 0
   abstract var minEnergy:Int
   abstract fun play()
   abstract fun feed()
   fun isHungry():Boolean = energy < minEnergy

    override fun toString(): String = "id: $id , energy : ${this.energy} e ${isHungry()}"

}

class Ant(id: Int):Animal(id){

    override var minEnergy = 2

    override fun feed() {
       this.energy++
    }

    override fun play() {
       this.energy--
    }
}

class Lion(id: Int):Animal(id){

    override var minEnergy = 12

    override fun feed() {
         this.energy = this.energy + 8
    }

    override fun play() {
        this.energy = this.energy - 8
    }

    fun roar() = println("Rooooaaaaaaaaa")

}