package com.example.myapplication

fun main() {

    println(ej1EsPar(8))
    println(ej2CompararTextos("Hola", "Holaa"))
    println(ej3esMayorQue10YMenorQue20(12, 17))
    println(ej4evaluarCalificacion(40))
    println(ej5sumarNumeros(1, 2, 3))
    println(ej6invertirArray(arrayOf(1, 2, 3, 4, 5)).joinToString(", "))  // Imprime: 5, 4, 3, 2, 1
    println(ej7agregarFrutaADLista(listOf("Manzana", "Banana", "Naranja"), "Fresa"))  // Imprime: [Manzana, Banana, Naranja, Fresa]
    ej8eliminarColorDeLista()
    ej9imprimirNumeros()
    println("")
    ej10imprimirLista(listOf(1, 2, 3, 4, 5))
    println("")
    ej11imprimirNumerosHastaN(5)
    println("")
    /*ej12imprimirNumerosPositivos()*/
    println(ej13esPrimo(17))

    val primoMayorQue100 = ej14encontrarPrimoMayorQue100()
    println(primoMayorQue100)  // Imprime: 101



}

fun ej1EsPar(numero: Int): Boolean {
    return numero % 2 == 0
}

/*2. Crea una función llamada compararTexto que tome dos
cadenas de texto como argumentos y determine si son iguales
utilizando tanto equals() como el operador ==*/
fun ej2CompararTextos(Cadena1: String, Cadena2: String): Boolean {
     return Cadena1.split(",") == Cadena2.split(",")
}

/*3. Implementa una función llamada esMayorQue10YMenorQue20 que tome
dos números como argumentos y devuelva true si ambos números son
mayores que 10 y menores que 20, y false en caso contrario.*/

fun ej3esMayorQue10YMenorQue20(num1: Int, num2: Int): Boolean {
    return num1 > 10 && num1 < 20 && num2 > 10 && num2 < 20
}

/*4. Crea una función llamada evaluarCalificacion que tome la calificación
de un estudiante (un número entre 0 y 100) como argumento y devuelva una
letra de calificación (A, B, C, D, F) utilizando una estructura when.*/

fun ej4evaluarCalificacion(calificacion: Int): String {
    return when {
        calificacion >= 90 -> "A"
        calificacion >= 80 -> "B"
        calificacion >= 70 -> "C"
        calificacion >= 60 -> "D"
        calificacion >= 0 -> "F"
        else -> "Calificación no válida"
    }
}

/*5. Define una función llamada sumarNumeros que tome un número variable
de argumentos utilizando vararg y devuelva la suma de todos los números.*/

fun ej5sumarNumeros(vararg numeros: Int): Int {
    return numeros.sum()
}

/*6. Implementa una función llamada invertirArray que tome un array de números
como argumento y devuelva un nuevo array con los elementos en orden inverso.*/

fun ej6invertirArray(numeros: Array<Int>): Array<Int> {
    return numeros.reversedArray()
}

/*7. Crea una lista inmutable de nombres de
frutas y agrega una fruta adicional a la lista.*/

fun ej7agregarFrutaADLista(frutas: List<String>, frutaAdicional: String): List<String> {
    return frutas + frutaAdicional
}

/*8. Utiliza una lista mutable para almacenar
nombres de colores y elimina un color de la lista*/

fun ej8eliminarColorDeLista() {
    val colores = mutableListOf("Rojo", "Verde", "Azul", "Amarillo")
    colores.remove("Verde")
    println(colores)  // Imprime: [Rojo, Azul, Amarillo]
}

/*9. Escribe una función llamada imprimirNumeros que
utilice un bucle for para imprimir los números del 1 al 10*/

fun ej9imprimirNumeros() {
    for (numero in 1..10) {
        print(numero)
    }
}

/*10. Define una función llamada imprimirLista que tome una
lista de números como argumento y utilice un bucle forEach
para imprimir cada número en la lista.*/

fun ej10imprimirLista(numeros: List<Int>) {
    numeros.forEach { numero ->
        print(numero)
    }
}

/*11. Implementa una función llamada imprimirNumerosHastaN
que tome un número como argumento y utilice un bucle while
para imprimir los números del 1 al número dado.*/

fun ej11imprimirNumerosHastaN(n: Int) {
    var i = 1
    while (i <= n) {
        println(i)
        i++
    }
}

/*12. Crea una función llamada imprimirNumerosPositivos que utilice un
bucle do-while para imprimir números positivos hasta que se alcance un número negativo.*/

/*fun ej12imprimirNumerosPositivos() {
    var numero: Int

    do {
        println("Introduce un número (negativo para terminar):")
        numero = readLine()?.toIntOrNull() ?: 0
        if (numero >= 0) {
            println(numero)
        }
    } while (numero >= 0)
}*/

/*13. Define una función llamada esPrimo que tome un número como argumento y devuelva
true si es primo y false si no lo es. Utiliza una declaración return para salir de
la función una vez que se determine si el número es primo.*/

fun ej13esPrimo(numero: Int): Boolean {
    if (numero <= 1) return false
    for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
        if (numero % i == 0) return false
    }
    return true
}

fun ej14encontrarPrimoMayorQue100(): Int? {
    for (numero in 101..Int.MAX_VALUE) {
        if (ej13esPrimo(numero)) {
            return numero
        }
    }
    return null
}







