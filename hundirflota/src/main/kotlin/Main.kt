package org.alejandro.kotlin


fun main(){
    var diccionarioJugador : MutableMap<String,Any> = mutableMapOf()
    var nombreJugador : String = "None"
    val opcionMenu = menu()
    when (opcionMenu) {
        1 -> {
            establecerConexion(diccionarioJugador, nombreJugador) // tengo que cambiar esto y añadir un diccionario
        }
        2 -> {
            configurarBarcos()
        }
        3 -> {
            return
        }
    }
}
