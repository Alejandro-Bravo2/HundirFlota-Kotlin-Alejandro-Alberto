package org.alejandro.kotlin


/**
 * Función encargada de limpiar la pantalla
 */
fun limpiarPantalla(){
    if (System.getProperty("os.name").contains("Windows")) {
        Runtime.getRuntime().exec("cmd /c cls")
    } else{
        Runtime.getRuntime().exec("clear")
    }
}