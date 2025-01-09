package org.alejandro.kotlin


/**
 * Función encargada de mostrar el menú por pantalla tras la configuración de los barcos.
 * @param diccionarioJugador: Diccionario con la información del jugador.
 */
fun menuLuegoConf(diccionarioJugador: MutableMap<String,Any>){
    val rangoOpciones = Regex("[1-2]")
    limpiarPantalla()
    println("-----MENU------")
    println("Has establecido una nueva configuración para tu partida. ¿Qué deseas hacer ahora?")
    println("1- Jugar")
    println("2- Salir")

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

    when (entrada) {
        1 -> {
            establecerConexion(diccionarioJugador)
        }
        2 -> {
            return
        }
    }
}

