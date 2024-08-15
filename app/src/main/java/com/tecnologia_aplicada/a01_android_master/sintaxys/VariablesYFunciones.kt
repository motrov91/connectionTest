package com.tecnologia_aplicada.a01_android_master.sintaxys



fun main(){
    /** Variables númericos */

    //Int -2,147,483,647 a 2,147,483,647
    val  age : Int = 30

    //El long ocupa mas espacio de memoria
    //Long -9,223,372,036,854.775,807 a 9,223,372,036,854,775,807
    val example:Long = 30

    //Float adminte 6 decimales
    val floatExample:Float = 30.5f

    //Double soporta 14 decimales
    val doubleExample: Double = 321.3123456

    /** Variables alfanúmericas */

    //Char solo soporta un caracter debe ir dentro de comillas simples
    val charExample1:Char = 'E'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    //String contenendor de caracteres, debe ir con comillas dobles
    val stringExample:String = "Manuel Fernando suscribete"

    /** Variables booleanas */
    //Booleanas
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false

    println(stringExample)

    /** Diferencias entre valores y variables */
    //Los valores no pueden ser reasignados
    val newAge: Int = 30

    //Para poder reasignar valores necesitaremos cambiar el val por var
    var newAge2: Int = 30
    newAge2 = 34

//------------------------------------------------------------------------------------------------//
    /** Funciones aritmeticas*/

    println("Sumar:")
    println(age + newAge2)

    println("Restar:")
    println(age - newAge2)

    println("Multiplicar:")
    println(age * newAge2)

    println("Modulo:")
    println(age % newAge2)

    /** Conversiones de variables */
    var exampleSuma:Int = age + floatExample.toInt()

    /** Concatenar valores */
    var newString1: String = "23"
    var newString2: String = "54"

    var newVal:String = newString1 + newString2

    println(newVal)

    //String concatenada (Template Strings)
    var newName: String = "Manuel Fernando"
    var nameExample: String = "Hola"
    nameExample = "Hola me llamo $newName y tengo $age"
    println(nameExample)

    funcionDeSaludo()

    showMyName("Manuel", 33)

    val miSuma = sumarValores(10, 10)
    println(miSuma)

    edadPorDefecto()

}

//Las funciones son contenedores de codigos que sirven para realizar una actividad especifica
//Funcion básica
fun funcionDeSaludo(){
    /**
     * NOTA: Todas las variables que van dentro de una funcion son llamadas variables de funcion
     * se les llama asi porque solo pueden ser referenciadas dentro de la funcion donde fueron creadas
     * */

    val name: String = "Manuel Fernando Ramirez Villamil"
    val age: Int = 33

    println("Hola mi nombre es $name y tengo $age años")
}

//Funcion con parametros de entrada
fun showMyName(name:String, currentAge:Int){
    println("Hola me llamo $name y mi edad es $currentAge")
}

//Funciones con parametros de entrada y de salida
//Despues de los parametros de entrada le indicamos con :Int el tipo de valor que va a retornar
fun sumarValores(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

//Acortar funciones con retorno
//Tambien podemos quitar la declaracion del retorno, lo tomará explicitamente
fun sumarValorCool(firstNumber: Int, secondNumber: Int) = firstNumber + secondNumber

//Funciones con parametros por defecto
//el igual indica que si no se le pasa el parametro tome el valor por defecto en este caso 33
fun edadPorDefecto(edad:Int = 33){
    println("Mi edad es $edad")
}