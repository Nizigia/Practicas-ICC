Introducci ́on a Ciencias de la Computaci ́on

Practica 1

Profesor: Salvador L ́opez Mendoza
Ayudante: Yanah ́ı Demerio Torres
Ayudante de Laboratorio: Rosa Victoria Villa Padilla
Fecha de entrega: 9 de octubre de 2026 a las 23:59pm

1 Psic ́ologo (5 pts)
1.1 Objetivo

El objetivo de esta pr ́actica es que el alumno se familiarice con la creaci ́on y uso de ob-
jetos de la clase String utilizando algunos m ́etodos de dicha clase en la elaboraci ́on de un

programa.
1.2 Descripci ́on general
La pr ́actica consiste en utilizar cadenas de caracteres y algunos de los m ́etodos de dicha
clase en la elaboraci ́on de un programa para simular una sesi ́on con un psic ́ologo.
1.3 Desarrollo
1. Crea el archivo el Psicologo.java, en el directorio de trabajo para esta pr ́actica.
2. Realiza el metodo main para que este haga lo siguiente:
(a) Dar bienvenida y solicitar el nombre del paciente.
(b) Recabar el nombre del paciente.
(c) Saludar al paciente y preguntar cu ́al es su problema.
(d) Leer, en una l ́ınea, la descripci ́on del problema del paciente.
(e) Contestar MMMM... ya veo, luego en otra l ́ınea Y digame... y otra l ́ınea m ́as
preguntar Por qu ́e dice e incluir la respuesta anterior entre comillas.
(f) Leer, la respuesta del paciente.
(g) Finalmente decir Muy interesante!!, Hablaremos de ello con m ́as detalle en la
siguiente sesi ́on.
3. Compilar y ejecutar el programa. Este debe presentar un di ́alogo como el siguiente.  ́
Bienvenido, cual es su nombre?
Alberto
Buenas tardes Alberto.
Digame, cu ́al es su problema en la vida?
Odio tener clase los viernes
MMMM... ya veo
Y digame ...
Por qu ́e dice "odio tener clases los viernes"?
Porque no puedo concentrarme y el fin de semana me parece muy corto.
Muy interesante!! Hablaremos de ello con m ́as detalle en la siguiente sesi ́on.
Ojo! El texto de la segunda, quinta y novena l ́ınea es proporcionado por el usuario.
2 RFC (5 pts)
2.1 Descripci ́on general

La pr ́actica consiste en utilizar cadenas de caracteres y algunos de los m ́etodos m ́as impor-
tantes de dicha clase en la elaboraci ́on de un programa para generar una clave al estilo del

RFC de las personas.
El RFC se obtiene tomando las dos primeras letras del apellido paterno, la inicial del
apellido materno y la inicial del nombre, seguido de los dos  ́ultimos d ́ıgitos del a ̃no de
nacimiento, los dos d ́ıgitos del mes de nacimiento y dos d ́ıgitos del d ́ıa de nacimiento. Por
ejemplo, si la persona se llama Andrea Lopez Lopez y naci ́o el 14/04/1992, su RFC es
lola920414.
2.2 Desarrollo
1. Crea el archivo RFC.java en el directorio de trabajo para esta pr ́actica.
2. Escribir en el archivo RFC.java un programa para generar el RFC de una persona.
El algoritmo que debe programarse es el siguiente:
(a) Solicitar al usuario su nombre completo, en una l ́ınea.
(b) Solicitar al usuario su fecha de nacimiento, en formato dd/mm/aa, es decir, dos
d ́ıgitos para el d ́ıa, dos para el mes y dos m ́as para el a ̃no. Cada dato separado
por una diagonal.
(c) Recabar los datos solicitados.
(d) Extraer la inicial del nombre de la persona.
(e) Extraer las dos primeras letras del apellido paterno.
(f) Extraer la inicial del apellido materno.
(g) Formar el RFC con las letras antes obtenidas.
(h) Manipular la fecha de nacimiento, es decir extraer el a ̃no, el mes mes y el d ́ıa y
agregarlo al RFC.
3. Compilar y ejecutar el programa RFC. El programa debe mostrar una salida como
la siguiente:
Dame el nombre completo
Andrea Lopez Lopez
ingresa la fecha de nacimiento en formato dd/mm/aa
14/04/92
El RFC de Andrea Lopez Lopez es: LOLA920414
