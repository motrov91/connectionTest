package com.tecnologia_aplicada.a01_android_master.sintaxys

fun main(){
    getMonth()
    result(true)
}

//Ahora veamos como retornar Strings
fun getSemesterString (month: Int): String {
    return when(month){
        in 1.. 6 -> "Primer Semestre"
        in 7.. 12 -> "Segundo Semestre"
        !in 1 .. 12 -> "Semestre invalido"
        else ->  "Dawwwwww"
    }
}
/** Tambien se peude hacer de otra manera */
fun getSemesterStrin (month: Int) = when(month){
    in 1.. 6 -> "Primer Semestre"
    in 7.. 12 -> "Segundo Semestre"
    !in 1 .. 12 -> "Semestre invalido"
    else ->  "Dawwwwww"
}

fun result(value: Any){
    when(value){
        is Int -> value + value
        is String -> print(value)
        is Boolean ->if(value) println("Holiiiis")
    }
}

fun getRange(month:Int){
    when(month){
        in 1 .. 6 -> print("Primer Semestre")
        in 7 .. 12 -> print("Segundo Semestre")
        else -> print("Semestre no valido")
        //El else se puede reemplazar por !in
        //!in 1 .. 12 -> print("Semestre no valido")
    }
}

fun getTrimestre(month: Int){
    when(month){
        1,2,3 -> println("Primer Trimestre")
        4,5,6 -> println("Segundo Trimestre")
        7,8,9 -> println("Tercer Trimestre")
        10,11,12 -> println("Cuarto Trimestre")
    }
}

fun getMonth(month:Int = 1){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            println("Noviembre")
            println("Noviembre")
            println("Noviembre")
        }
        12 -> println("Diciembre")
        else -> println("No es un mes válido")
    }
}