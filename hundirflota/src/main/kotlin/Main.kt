package org.alejandro.kotlin


fun main(){
    var diccionarioJugador : MutableMap<String,Any> = mutableMapOf()
    val opcionMenu = menu()
    when (opcionMenu) {
        1 -> {
            establecerConexion(diccionarioJugador) // tengo que cambiar esto y añadir un diccionario
        }
        2 -> {
            configurarBarcos()
        }
        3 -> {
            return
        }
    }
}
