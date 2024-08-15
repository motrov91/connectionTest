package com.tecnologia_aplicada.a01_android_master.sintaxys

fun main(){
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifMultipleAND()
    ifMultipleOR()
}

fun ifMultipleOR(){
    var pet = "cat"
    var isHappy = true

    if(pet == "cat" || pet == "dog"){
        print("Es un gato o un perro")
    }

    /** Condiciones mas complejas */
    if(pet == "dog" || (pet == "cat" && isHappy)){
        print("Es un perro o un gato feliz")
    }
}

fun ifMultipleAND(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy){
        println("Puedo beber cerveza")
    }
}

fun ifBoolean(){
    var soyFeliz = true

    if(soyFeliz){
        println("Estoy feliz")
    }else{
        println("Estoy triste")
    }

}

fun ifAnidado(){
    val animal = "bird"

    if (animal == "dog"){
        println("El animal es un perrito!")
    } else if (animal == "cat"){
        println("El animal es un Gatico!")
    } else if (animal == "bird"){
        println("El animal es un pajarito")
    } else {
        println("No es ninguno de los animales esperados")
    }
}

fun ifBasico(){
    val name = "Manu"

    if(name == "Pepe"){
        println("Oye, la variable name es Pepe")
    }else{
        println("La variable tiene otro nombre")
    }
}