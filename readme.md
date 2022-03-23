**Concurso de preguntas y respuestas al estilo quién quiere ser millonario desarrollado con Java y MySQL**

**Autor**
Monica Torrado

#### Tabla de contenido

- [Descripción de la necesidad](#descripción-de-la-necesidad)
- [Tecnologías empleadas](#tecnologías-empleadas)
- [Almacenamiento de información](#almacenamiento-de-información)
- [Modo de uso](#modo-de-uso)

#### Descripción de la necesidad

Lo que se busca en este juego es pre-construir una serie de preguntas con 4 opciones de respuesta y una de ella válida, además de una categoría asociada con el mismo nivel de dificultad. Cada pregunta debe estar categorizada y debe existir mínimo 5 preguntas por categoría donde por cada ronda se debe extraer una pregunta de esa categoría de forma aleatoria, debe existir 5 rondas en todo el juego, cada ronda otorga premios (puntos o dinero) cuando el jugador acierta correctamente.

El acomulado de premios está dentro del concurso pero si dado el caso el jugador pretender salir de juego puede retirarse antes de responder a la pregunta, si por el contrario el jugador pierde entonces saldría del juego sin el acomulado que llevaría en ese momento.

**Ejemplo**

1. Precondiciones: Debe de tener 25 preguntas (5 preguntas por categorías) para 5 rondas, cada categoría tiene una complejidad o nivel de dificultad, cada ronda debe asignarle un premio que el jugador va a ganar, el premio puede ser puntos o dinero.
2. El jugador inicia con la primera ronda, el sistema busca la categoría del primer nivel y escoge una pregunta de esa categoría.
3. El Jugador selecciona una opción de las 4 opciones que tiene, si pierde se finaliza el juego si gana continua a la siguiente ronda.
4. La siguiente ronda selecciona una pregunta de un grado de complejidad mayor según la categoría. Hace el mismo comportamiento del ítem 4. 
5. Si llega a la ronda 5 y pasa, entonces gana el juego, el premio mayor debería estar en la última ronda.

**Funcionalidades**

**- Configurar Juego:** Crear las preguntas y respuestas (con 3 opciones erradas y 1 valida) con sus categorías correspondientes (mínimo 25 preguntas).
**- Iniciar el juego:** se debe iniciar el juego con la primera ronda y de forma aleatoria debe seleccionar una pregunta según la categoría más baja.
**- Responder a la pregunta:** debes seleccionar una opción de 4 posibles.
**- Aumentar de nivel:** al responder de forma correcta deberás aumentar de nivel y de esa manera otorgar premios según la ronda que este. Ordena primero tus categorías y de esa manera sabrás en qué ronda estás ubicado.
**- Acumular premio:** cada vez que ganes debes tener un premio total que tienes como jugador.
**- Fin del juego voluntario o ganara ronda final:** se finaliza el juego porque el jugador decide y el acomulado pasa al jugador (guarda los datos del jugador)
**- Fin del juego forzado:** el sistema finaliza el juego porque no seleccionó una respuesta correcta. (guarda los datos del jugador)
**- Persistencia de datos:** al finalizar el juego se debe guardar los datos del jugador como  histórico del juego.

#### Tecnologías empleadas
Para el desarrollo de este juego de escritorio se usaron las siguientes tecnologías y/o herramientas:
**- Entorno de Desarrollo Integrado (IDE):** Apache NetBeans
**- Lenguaje de programación: Java con el uso del gestor de dependencias Maven
**- Motor de base de datos:** MySQL
**- Sistema de gestión de bases de datos:** XAMPP
**- Servidor web:** Apache

#### Almacenamiento de información

En las siguientes tablas se relaciona la base de datos con las tablas empleadas para el manejo de la información necesaria para el juego con sus respectivos campos:

**Nombre de la base de datos:** juego_preguntas

**- Nombre de la tabla:** jugador

| **Nombre del campo**      |
|---------------------------|
| id_jugador                |
| nombre_jugador            |
| puntaje                   |

**- Nombre de la tabla:** preguntas

| **Nombre del campo**      |
|---------------------------|
| id_pregunta               |
| categoria_pregunta        |
| pregunta                  |

**- Nombre de la tabla:** respuestas

| **Nombre del campo**      |
|---------------------------|
| id_respuesta              |
| id_pregunta               |
| respuesta                 |
| respuesta_correcta        |
| puntuacion_respuesta      |

#### Modo de uso
Programas necesarios para la ejecución del juego:
- XAMPP: https://www.apachefriends.org/es/download.html
- Java Runtime Environment (JVM): https://www.java.com/es/download/ie_manual.jsp

Preparación del sistema para la ejecución del juego:
1. Ejecutar XAMPP e iniciar el servidor Apache (puertos 80 y 443 por defecto) y el motor de base de datos MySQL (puerto 3306 por defecto)
2. Seleccionar la opción Admin del motor de base de datos MySQL del programa XAMPP
3. Verificar que en la sección de Cuentas de usuarios existe el usuario 'root' y tenga configurada la contraseña 'admin', de no existir se debe crear uno con estas características y asignarle todos los privilegios
4. En las opciones de menu de la izquierda, crear una base de datos con el nombre de 'juego_preguntas'
5. Ejecutar los Scripts SQL existentes en los recursos del proyecto (src\main\resources\SQL_JuegoPreguntas)
6. Ejecutar el juego desde el archivo ConcursoPreguntas.jar ubicado en la raíz del proyecto