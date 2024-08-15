package com.tecnologia_aplicada.a01_android_master.sintaxys

fun main(){
    //inmutableList()
    mutableList()

}

fun mutableList(){
    val weekDays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays)

    //Add añade al final de la lista
    //weekDays.add("manuelday")
    //Add puede recibir el indice donde quiero ubicar mi nuevo elemento
    weekDays.add(0, "ManuelDay ")
    println(weekDays)

    //Para verificar si una lista esta llena usamos isEmpty()
    if(weekDays.isEmpty()){
        //no voy a hacer nada porque esta vácia
    }else{
        weekDays.forEach{ println(it) }
    }


    //Para recorrer listas lo mas usado es foreach
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])

    //Obtener el ultimo valor
    println(readOnly.last())
    //Obtener el primer valor
    println(readOnly.first())

    //filtrar listas
    //it recorre cada posición
    val example = readOnly.filter { it.contains("a")}
    println(example)

    //filtrar con foreach
    readOnly.forEach { days -> println(days) }
}