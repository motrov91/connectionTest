package com.tecnologia_aplicada.a01_android_master.sintaxys

fun main(){
    val weekdays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //Para el tamaño del array usamos size
    //println(weekdays[weekdays.size - 1])

    //Modificar valores
    weekdays[0] = "Holiiiiist"

    //Bucles para arrays
    for(position in weekdays.indices){
        //println("He pasado por aqui ${weekdays[position]}")
    }

    //Otra forma de recorrer el arreglo y obtener la posicion y el valor
    for((position, value) in weekdays.withIndex()){
        println("La posicion $position contiene $value")
    }

    //Obtener solamente el valor de un array
    for(weekday in weekdays){
        println("Ahora es $weekday")
    }
}