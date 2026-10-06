# Introduccion a Ciencias de la Computacion

## Practica 1

Profesor: Salvador Lopez Mendoza

Ayudante: Yanahi Demerio Torres

Ayudante de Laboratorio: Rosa Victoria Villa Padilla

Fecha de entrega: 9 de octubre de 2026 a las 23:59pm

## 1 Psicologo (5 pts)
### 1.1 Objetivo

El objetivo de esta practica es que el alumno se familiarice con la creacion y uso de objetos de la clase String utilizando algunos metodos de dicha clase en la elaboracion de un programa.
### 1.2 Descripcion general
La practica consiste en utilizar cadenas de caracteres y algunos de los metodos de dicha clase en la elaboracion de un programa para simular una sesion con un psicologo.
### 1.3 Desarrollo
#### 1. Crea el archivo el Psicologo.java, en el directorio de trabajo para esta pr ́actica.
#### 2. Realiza el metodo main para que este haga lo siguiente:
(a) Dar bienvenida y solicitar el nombre del paciente.

(b) Recabar el nombre del paciente.

(c) Saludar al paciente y preguntar cuaal es su problema.

(d) Leer, en una lınea, la descripcion del problema del paciente.

(e) Contestar MMMM... ya veo, luego en otra lınea Y digame... y otra lınea mas preguntar Por que dice e incluir la respuesta anterior entre comillas.

(f) Leer, la respuesta del paciente.

(g) Finalmente decir Muy interesante!!, Hablaremos de ello con mas detalle en la siguiente sesi on.
#### 3. Compilar y ejecutar el programa. Este debe presentar un di ́alogo como el siguiente.  ́
Bienvenido, cual es su nombre?

Alberto

Buenas tardes Alberto.

Digame, cual es su problema en la vida?

Odio tener clase los viernes

MMMM... ya veo

Y digame ...

Por que dice "odio tener clases los viernes"?

Porque no puedo concentrarme y el fin de semana me parece muy corto.

Muy interesante!! Hablaremos de ello con mas detalle en la siguiente sesion.

Ojo! El texto de la segunda, quinta y novena linea es proporcionado por el usuario.

## 2 RFC (5 pts)
### 2.1 Descripcion general

La practica consiste en utilizar cadenas de caracteres y algunos de los metodos m ́as importantes de dicha clase en la elaboracion de un programa para generar una clave al estilo del RFC de las personas.

El RFC se obtiene tomando las dos primeras letras del apellido paterno, la inicial del
apellido materno y la inicial del nombre, seguido de los dos  ́ultimos d ́ıgitos del a ̃no de
nacimiento, los dos d ́ıgitos del mes de nacimiento y dos d ́ıgitos del d ́ıa de nacimiento. Por
ejemplo, si la persona se llama Andrea Lopez Lopez y naci ́o el 14/04/1992, su RFC es
lola920414.

### 2.2 Desarrollo
#### 1. Crea el archivo RFC.java en el directorio de trabajo para esta pr ́actica.
#### 2. Escribir en el archivo RFC.java un programa para generar el RFC de una persona.
El algoritmo que debe programarse es el siguiente:

(a) Solicitar al usuario su nombre completo, en una l ́ınea.

(b) Solicitar al usuario su fecha de nacimiento, en formato dd/mm/aa, es decir, dos dıgitos para el dıa, dos para el mes y dos mas para el año. Cada dato separado por una diagonal.

(c) Recabar los datos solicitados.

(d) Extraer la inicial del nombre de la persona.

(e) Extraer las dos primeras letras del apellido paterno.

(f) Extraer la inicial del apellido materno.

(g) Formar el RFC con las letras antes obtenidas.

(h) Manipular la fecha de nacimiento, es decir extraer el año, el mes mes y el dıa y agregarlo al RFC.
#### 3. Compilar y ejecutar el programa RFC. El programa debe mostrar una salida como la siguiente:
Dame el nombre completo

Andrea Lopez Lopez

ingresa la fecha de nacimiento en formato dd/mm/aa

14/04/92

El RFC de Andrea Lopez Lopez es: LOLA920414
