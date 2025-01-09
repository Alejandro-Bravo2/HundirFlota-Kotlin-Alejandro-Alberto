package org.alejandro.kotlin

/**
 * Función encargada de establecer conexión con otro jugador.
 * @param diccionarioJugador: Diccionario con la información del jugador.
 */
fun establecerConexion(diccionarioJugador : MutableMap<String,Any>) {
    val general = FicheroGeneral()
    val existencia = general.comprobarExistencia()
    val nombreJugador : String
    if (!existencia){
        general.crearFichero()
    }

    nombreJugador = general.revisarJugadores()
    general.agregarJugadorAPartida()



    var diccionarioGeneral = general.leerFichero()
    while (diccionarioGeneral["nombre_partida"] != "j1 vs j2"){
        println("Estas en la cola de espera...")
        tiempoEspera()
        diccionarioGeneral = general.leerFichero()
    }

    val ficheroJugador = FicheroUsuario(nombreJugador)
    val existenciaFicheroJugador = ficheroJugador.comprobarExistencia()
    if (!existenciaFicheroJugador){
        ficheroJugador.crearFichero()
    }
    if (!diccionarioJugador.isEmpty()){
        ficheroJugador.escribirFichero(diccionarioJugador)
    }
    tiempoEspera()
    jugar(ficheroJugador, general, nombreJugador)

}
