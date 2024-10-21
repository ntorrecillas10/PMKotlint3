package com.example.myapplication

fun main() {

    println(ej1EsPar(8))
    println(ej2CompararTextos("Hola", "Holaa"))
    println(ej3esMayorQue10YMenorQue20(12, 17))
    println(ej4evaluarCalificacion(40))
    println(ej5sumarNumeros(1, 2, 3))
    println(ej6invertirArray(arrayOf(1, 2, 3, 4, 5)).joinToString(", "))  // Imprime: 5, 4, 3, 2, 1


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


