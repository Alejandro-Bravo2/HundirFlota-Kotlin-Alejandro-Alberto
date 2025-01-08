# HundirFlota-Kotlin-Alejandro-Alberto

# Actividad: Hundir la Flota Multijugador

**Trabajo realizado por:** Alejandro y Alberto Rodríguez

---

### 1. Descripción

Para poder comenzar el juego, se necesitará abrir 2 pestañas en IntelliJ IDEA
donde se tendrá que ejecutar el programa para poder establecer la conexión local.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/establecerConexion.kt#L7-L38
Aquí se leen los archivos del propio fichero donde se ejecuta el programa para poder acceder a la información
y actualizarla directamente.

A ambos jugadores se les recibe con un menú donde pueden darle comienzo al juego o configurar sus propios
barcos. 
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Menu.kt#L7-L31
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/MenuLuegoJConf.kt#L8-L38

En caso de querer configurar los barcos, el programa empezará a preguntar por coordenadas para introducir, y solo tomará valores válidos hasta que todos los barcos estén colocados sobre el tablero.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/configurarBarcos.kt#L7-L195

Una vez se ha establecido conexión, el juego dará comienzo y a cada ejecución del programa
se le asignará uno de los dos jugadores: el jugador activo y el jugador pasivo.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/instanciaOtroJugador.kt#L8-L16

El juego será ejecutado a través de la siguiente función, que permite que se pueda ejecutar varias veces:
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Jugar.kt#L10-L75


Una vez ha dado comienzo el juego, el jugador activo podrá ver su tablero de ataque, constando únicamente
de sus ataques con respecto al tablero del oponente. Aquí podrá introducir una coordenada para atacar 
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Atacante.kt#L12-L86

Cuando ya haya atacado el jugador atacante, se registra este ataque en el fichero.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Atacante.kt#L95-L148

Por otro lado, el jugador pasivo podrá ver su tablero siendo actualizado a tiempo real.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Jugar.kt#L86-L121



Una vez se termine este turno, el progrma cambia los roles entre el jugador activo y el pasivo.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/cambioTurno.kt#L8-L17


Todo esto continuará hasta que haya un ganador (cuando a ninguno de los dos tableros le quede ningún barco)
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Jugar.kt#L141-L193
