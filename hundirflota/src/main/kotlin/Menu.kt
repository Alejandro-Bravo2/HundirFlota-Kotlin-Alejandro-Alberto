package org.alejandro.kotlin

/**
 * Función encargada de mostrar el menú de inicio
 * @return: Int dentro del rango de valores 1-3
 */
fun menu() : Int{
    val rangoOpciones = Regex("[1-3]")
    println("Iniciando el juego Hundir la Flota Multijugador.")
    println("---------------------------------------------------")
    println()

    println("----MENU-----")
    println("1- Jugar")
    println("2- Modificar Tablero")
    println("3- Salir")
    var entrada : Int = 9
    while (entrada == 9) {
        try {
            print("Elija una opción que esté dentro del menú => ")
            entrada = readln().toInt()
            if (!rangoOpciones.matches(entrada.toString())) {
                entrada = 9
                println("Tienes que introducir un valor que esté dentro del rango de las opciones del menú")
            }
        } catch (e: NumberFormatException) {
            println("Por favor debes introducir un valor numérico")
        }
    }
    return entrada
}
