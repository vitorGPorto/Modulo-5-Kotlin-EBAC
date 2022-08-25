package com.porto.exerciciomodulo5

class Exercicio05 {

}

fun main() {
    var veiculo = Veiculo("UNO")
    veiculo.print()
    veiculo.addSpeed(30)
    veiculo.reduceSpeed(10)
    veiculo.printVelocity()
}

class Veiculo(model: String){

   var velocity : Long
   var acceleration: Long
   var model: String

   init {
       this.velocity = 0
       this.acceleration = 10
       this.model = model
   }

    fun addSpeed( increaseSpeed: Long ): Long{
        velocity = acceleration + increaseSpeed
        println("Mètodo 1\nA Velocidade atual é $velocity KM")

        return velocity
    }

    fun reduceSpeed(slowDown: Long) : Long{
        velocity = velocity - slowDown - acceleration

        if (velocity < 0  )
            velocity = 0

        println("Mètodo 2\nA Velocidade atual é $velocity KM")
        return velocity
    }

    fun print(){
        println(" Modelo: $model \n Velocidade: $velocity \n Aceleração: $acceleration ")
    }
    fun printVelocity(){
        println("Mètodo 3 \n Velocidade: $velocity KM atual!")
    }


}