# HundirFlota-Kotlin-Alejandro-Alberto

# Actividad: Hundir la Flota Multijugador

**Trabajo realizado por:** Alejandro y Alberto Rodríguez

---

### 1. Descripción

Para poder comenzar el juego, se necesitará abrir 2 pestañas en IntelliJ IDEA
donde se tendrá que ejecutar el programa para poder establecer la conexión local.

Aquí se leen los archivos JSON del propio fichero donde se ejecuta el programa para poder acceder a la información
y actualizarla directamente.

A ambos jugadores se les recibe con un menú donde pueden darle comienzo al juego o configurar sus propios
barcos. *En caso de no configurar los barcos, este se configurará antes de iniciar el juego.

Una vez se ha establecido conexión, el juego dará comienzo y a cada ejecución del programa
se le asignará uno de los dos jugadores: el jugador activo y el jugador pasivo.

Una vez ha dado comienzo el juego, el jugador activo podrá ver su tablero de ataque, constando únicamente
de sus ataques con respecto al tablero del oponente, mientras que el jugador pasivo podrá ver su tablero 
siendo actualizado a tiempo real.

En el caso de no introducir ningún ataque a tiempo, esto resultará en un ataque fallido que caerá en la coordenada
(0,0) siempre.

Una vez se termine este turno, el progrma cambia los roles entre el jugador activo y el pasivo, y esto
continuará hasta que haya un ganador (cuando a ninguno de los dos tableros le quede ningún barco)