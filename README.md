TPEDA - Fixture de la Copa
Trabajo integrador de la materia Estructura de Datos y Algoritmos. El
programa administra un torneo eliminatorio de 16 equipos mediante un arbol
binario y permite cargar los ganadores de cada fase hasta obtener al campeon.

Caracteristicas
Generacion de un fixture para 16 equipos.
Carga de resultados de octavos de final, cuartos de final, semifinales y
final.
Validacion del ganador ingresado en cada partido.
Consulta de los partidos y ganadores de una fase.
Visualizacion del campeon.
Uso de un arbol binario para representar el torneo.
Estructura del fixture
El arbol se construye desde los octavos de final hasta la final:

                         Final
                    /             \
              Semifinal 1      Semifinal 2
              /       \         /       \
          Cuartos 1 Cuartos 2 Cuartos 3 Cuartos 4
           /   \     /   \     /   \     /   \
          O1   O2   O3   O4   O5   O6   O7   O8
Cada nodo representa un partido y almacena:

Equipo 1.
Equipo 2.
Ganador.
Referencia al partido izquierdo.
Referencia al partido derecho.
Clases principales
TPEDA
Contiene el metodo main, muestra el menu y administra la interaccion con el
usuario.

ArbolFixture
Construye el arbol del torneo, carga los ganadores y permite mostrar cada fase
y al campeon.

NodoPartido
Representa un partido dentro del arbol. Guarda los equipos, el ganador y las
referencias a sus nodos hijos.

Requisitos
Java JDK 8 o superior.
NetBeans 8.2 o una version compatible.
El proyecto esta configurado para compilar con Java 8.

Abrir el proyecto en NetBeans 8.2
Abrir NetBeans.
Seleccionar File > Open Project.
Elegir la carpeta TPEDA, que contiene build.xml, nbproject y src.
Presionar Open Project.
Hacer clic derecho sobre el proyecto y seleccionar Clean and Build.
Ejecutar el proyecto con Run Project.
La clase principal configurada es:

tpeda.TPEDA
Como usar el programa
Las fases deben cargarse en orden:

Seleccionar 1- Generar fixture e ingresar los 16 equipos.
Seleccionar 2- Cargar octavos.
Seleccionar 3- Cargar cuartos.
Seleccionar 4- Cargar semifinales.
Seleccionar 5- Cargar final.
Seleccionar 6- Mostrar campeon.
La opcion 7- Salir muestra primero un submenu para consultar una fase y luego
finaliza la ejecucion.

Validacion de ganadores
Al cargar un partido, el ganador ingresado debe coincidir con uno de los dos
equipos participantes. La comparacion no distingue entre mayusculas y
minusculas.

El metodo trim() elimina espacios accidentales al principio y al final del
nombre ingresado.

Ejemplo:

Argentina vs Chile
Ganador: argentina
Si se ingresa un equipo que no participa en el partido, el programa muestra un
mensaje de entrada invalida y solicita nuevamente el ganador.

Estructura del proyecto
TPEDA/
|-- build.xml
|-- manifest.mf
|-- nbproject/
`-- src/
    `-- tpeda/
        |-- ArbolFixture.java
        |-- NodoPartido.java
        `-- TPEDA.java
Autores:

Carrizo Villareal Anna
Aguero Jonatan
Barros Edgardo.

Trabajo realizado para la materia Estructura de Datos y Algoritmos.
