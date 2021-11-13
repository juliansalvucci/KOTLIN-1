package com.example.fundamentoskotlin

class Principal {

    fun main(){
        newTopic("Hola Kotlin")

        newTopic("Variables y constantes")

        //Constantes
        val a = 2
        val b = "hola"
        val c = true
        println(a)

        //VARIABLES

        var d = 2

        var e:Int = 4

        var objNull : String? //signo de pregunta me permite que la variable admita nulos
        objNull = null

        var objNull2: Any? //La variable pude ser de cualquier tipo
        objNull2 = null
        objNull2 = "Hola"
        objNull2 = 123
    }

    fun newTopic(topic:String){
        println(topic)
        print(topic)

    }
}