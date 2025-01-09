package org.alejandro.kotlin


/**
 * Función encargada de cambiar el turno.
 * Esta función no revisa si el turno ha sido cambiado, sino que cambia el jugador atacante.
 */
fun cambioTurno(){
    val diccionarioGeneral = FicheroGeneral()
    var diccionarioConfiguracionGeneral : MutableMap<String, Any> = diccionarioGeneral.leerFichero()
    if (diccionarioConfiguracionGeneral["turno_actual"] == "j1"){
        diccionarioConfiguracionGeneral["turno_actual"] = "j2"
    } else if (diccionarioConfiguracionGeneral["turno_actual"] == "j2"){
        diccionarioConfiguracionGeneral["turno_actual"] = "j1"
    }
    diccionarioGeneral.escribirFichero(diccionarioConfiguracionGeneral)
}
