# HundirFlota-Kotlin-Alejandro-Alberto

# Actividad: Hundir la Flota (Kotlin)

**Trabajo realizado por:** Alejandro y Alberto

---

### Descripción:

- **Función para establecer conexión local:** Para poder comenzar el juego, se necesitarán abrir 2 pestañas en IntelliJ IDEA
donde se tendrá que ejecutar el programa para poder establecer la conexión local. Aquí se leerán los ficheros para poder acceder a la información necesaria para que el programa funcione correctamente.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/establecerConexion.kt#L7-L38

- **Función para el menú:** A ambos jugadores se les recibe con un menú donde pueden darle comienzo al juego o configurar sus propios
barcos.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Menu.kt#L7-L31
- **Función para la configuración:** En caso de querer configurar los barcos, el programa empezará a preguntar por coordenadas para introducir, y solo tomará valores válidos hasta que todos los barcos estén colocados sobre el tablero.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/configurarBarcos.kt#L7-L195
- **Función para el menú tras la configuración:** Cuando ya se haya cambiado la configuración se mostrará este menú por pantalla.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cabf8af2a621217dce9db46c6357d3a4b9b1335a/hundirflota/src/main/kotlin/MenuLuegoJConf.kt#L8-L38

- **Función para la asignación de jugadores:** Una vez se ha establecido conexión, el juego dará comienzo y a cada ejecución del programa
se le asignará uno de los dos jugadores: el jugador activo y el jugador pasivo.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/instanciaOtroJugador.kt#L8-L16

- **Función de juego:** El juego será ejecutado a través de la siguiente función, que permite que se pueda ejecutar varias veces:
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Jugar.kt#L10-L75


- **Función para el ataque:** Una vez ha dado comienzo el juego, el jugador activo podrá ver su tablero de ataque, constando únicamente
de sus ataques con respecto al tablero del oponente. Aquí podrá introducir una coordenada para atacar al otro jugador.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Atacante.kt#L12-L86

- **Función para registrar el ataque:** Cuando ya haya atacado el jugador atacante, se registra este ataque en el fichero.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Atacante.kt#L95-L148

- **Función para el jugador pasivo:** Por otro lado, el jugador pasivo podrá ver su tablero siendo actualizado a tiempo real.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Jugar.kt#L86-L121



- **Función para cambiar de turno:** Una vez se termine este turno, el programa cambia los roles entre el jugador activo y el pasivo.
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/cambioTurno.kt#L8-L17


- **Función para la comprobación del ganador:** Todo esto continuará hasta que haya un ganador (cuando a ninguno de los dos tableros le quede ningún barco).
https://github.com/Alejandro-Bravo2/HundirFlota-Kotlin-Alejandro-Alberto/blob/cc0f92adcded6cb91cd0da3ba99802fc381ef17e/hundirflota/src/main/kotlin/Jugar.kt#L141-L193
