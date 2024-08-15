package com.tecnologia_aplicada.a01_android_master.sintaxys

fun main(){
    var name: String? = null

    //Con los !! le aseguramos al sistema que la variable name!! puede ser nula
    //cuando usemos !! aseguremonos de antes haber validado que la variable no sea nula
    //println(name!![2])
    //Con el ? le estamos diciendo que si la variable name no es nula obtenga la posicion 2
    //get funciona igual que [2], el ? si es null retornaria un null, por lo tanto es importante
    //verificarlo con el operador ELVIS ?: para decir que hacer si el valor es nulo
    println(name?.get(2) ?: "Es nulo papi")
}