package org.alejandro.kotlin

fun establecerConexion(diccionarioJugador : MutableMap<String,Any>, rutaJugador : String) {
    val general = FicheroGeneral()
    val existencia = general.comprobarExistencia()
    val nombreJugador : String
    if (!existencia){
        general.crearFichero()
    }

    if (rutaJugador == "None"){
        nombreJugador = general.revisarJugadores()
        general.agregarJugadorAPartida()


    } else{
        nombreJugador = rutaJugador
    }
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
