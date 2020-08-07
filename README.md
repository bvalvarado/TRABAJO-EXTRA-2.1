## TUTORIAL PARA SIMULAR ARDUINO CON SENSORES Y ACTUADORES EN VIRTUAL BREADBOARD V4.46

<br>

**1. MARCO TEÓRICO**

<br>

**A.	ARDUINO UNO**

El Arduino es una placa basada en un microcontrolador ATMEL. Los microcontroladores son circuitos integrados en los que se pueden grabar instrucciones, las cuales las escribes con el lenguaje de programación que puedes utilizar en el entorno Arduino IDE o en otros entornos como Virtual Breadboard. Estas instrucciones permiten crear programas que interactúan con los circuitos de la placa.

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/1.jpg)

El microcontrolador de Arduino posee lo que se llama una interfaz de entrada, que es una conexión en la que podemos conectar en la placa diferentes tipos de periféricos. La información de estos periféricos que conectes se trasladará al microcontrolador, el cual se encargará de procesar los datos que le lleguen a través de ellos.

El tipo de periféricos que puedas utilizar para enviar datos al microcontrolador depende en gran medida de qué uso le estés pensando dar. Pueden ser cámaras para obtener imágenes, teclados para introducir datos, o diferentes tipos de SENSORES o ACTUADORES.

<br>

**B. SENSORES**

Un sensor es un dispositivo capaz de detectar magnitudes físicas o químicas, llamadas variables de instrumentación, y transformarlas en variables eléctricas. Las variables de instrumentación pueden ser, por ejemplo: temperatura, intensidad lumínica, distancia, aceleración, inclinación, desplazamiento, presión, fuerza, torsión, humedad, movimiento, pH, etc. 


![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/2.jpg)

Los sensores se pueden clasificar en función de los datos de salida en:

•	Digitales
•	Analógicos
•	Comunicación por Bus

Los sensores van conectados a las entradas de Arduino.
A la hora de elegir un sensor, debemos leer detenidamente las características y elegir uno que sea compatible con nuestro sistema (tensión y voltaje) y que sea sencillo de usar o nos faciliten una librería sencilla y potente.

<br>

**C. ACTUADORES**

Un actuador es un dispositivo capaz de transformar energía hidráulica, neumática o eléctrica en la activación de un proceso con la finalidad de generar un efecto sobre elemento externo. Este recibe la orden de un regulador, controlador o en nuestro caso un Arduino y en función a ella genera la orden para activar un elemento final de control como, por ejemplo, una válvula.

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/3.jpg)


Existen varios tipos de actuadores como son:

•	Electrónicos
•	Hidráulicos
•	Neumáticos
•	Eléctricos
•	Motores
•	Bombas

Los actuadores van conectados a las salidas de Arduino.

<br>

**D. VIRTUAL BREADBOARD V4.46**

Virtual Breadboard (VBB) es un emulador de circuitos integrados de tablero. También es capaz de funcionar como un entorno de desarrollo para microcontroladores. La aplicación se puede utilizar para desarrollar y depurar los microcontroladores y emulando circuitos, la programación de los paneles de control para aplicaciones embebidas, o incluso la creación de documentación para los circuitos.

Es un programa para el desarrollo de circuitos digitales en forma de tablero que permite crear software para  microcontrolador, se lo puede descargar en el siguiente enlace:


https://drive.google.com/file/d/1D8h9YMVnXV7pVNS0BMS18ocab3cW8D4e/view?usp=sharing


![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/4.jpg)


**CARACTERÍSTICAS:** 

•	Una interfaz intuitiva que podría ser utilizado fácilmente por cualquier persona que sabe lo que están haciendo.

•	Te da la oportunidad de personalizar su proyecto con varios componentes (instrumentos, temporizadores, generadores de funciones, motores, pantallas LCD / LED, y más).

•	Muestra el registro de errores, mientras que el circuito está emulando para que pueda ver lo que salió mal en tiempo real.

•	Requiere Java JRE, .NET Framework y Arduino.


<br>

**COMPONENTES PRINCIPALES DE VIRTUAL BREADBOARD V4.46**

El simulador cuenta con varias librerias útiles para realizar el diseño de un circuito electrónico básico a intermedio, una ventaja del simular es que cuenta con un módulo de programción en el cual se puede ingresar o digitar código para controlar microcontroladores como ARDUINO o PIC, además cuenta varias librerías con diversos componentes como integrados, motores, sensores incluso memorias RAM.

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/v1.jpg)

<br>

**BARRA DE MENU**

Son varias opciones en su mayoría de edición, quizá las opciones más representativas de este menú serían la opción para guardar el proyecto y el botón de compilar o iniciar simulación representado con un PLAY de color verde.

**PANTALLA DE DISEÑO**

Prácticamnete es nuestro espacio de trabajo, aquí se va ha realizar todo el diseño, implementación y conexiones del circuito.

**MAPA DE NAVEGACIÓN**

Es un indicador que ayuda al usuario a identificar en que lugar de la interfaz esta generando cambios o guardando información, es de gran ayuda al momento de detectar en que sección se cometió errores.

**MÓDULO DE PROGRAMACIÓN**

Este módulo se divide en dos partes la pantalla de progración que es donde escribimos las líneas de código y la pantalla de errores, esta pantalla nos ayudan a identificar cualquier tipo de error que se pueda generar al momento de escribir el código.


**MENÚ DE COMPONENTES**

Es una parte vital del simulador, aquí se encuentran todas las librerías de componentes existentes en Virtual BreadBoard desde los más básicos situados en la parte superior hasta elementos más sofisticados.

Para acceder a ellos simplemente se debe dar clic sobre el dispositivo deseado y clic en la pantalla de diseño, de esta manera se puede seleccionar cualquier elemento, en el caso de los elemnetos más complejos se encuentran clasificados por categorías según su función.

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/v2.jpg)

<br>

Para hacer referencia a las categorías más representativas tenemos el siguiente gráfico de cada categoría con sus respectivos elementos:

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/v3.jpg)



<br>

**2.	DIAGRAMA DE CONEXIÓN**


![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/7.jpg)

<br>

El sensor de temperatura se conectará a los terminales de 5V y GND siendo la patilla central el valor analógico que medirá la temperatura. Los extremos son para alimentación, mientras que el pin central proporciona la medición en una referencia de tensión, a razón de 10 mV por cada grado centígrado.

El pin central del sensor va conectado al puerto A1 del arduino, ya que es un pin de datos, una vez ejecutado el programa la respuesta en ALTO será hacia el pin de salida 13 al cual va conectado la terminal positiva del motor mientras que la otra va conectada a GND.

<br>

**3.	LISTA DE COMPONENTES**

<br>

**3.1	COMPONENTES GENERALES** 

<br>

•	Computador con  Sistema Operativo Windows 8 ó 10

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/5.jpg)

<br>

•	Software de simulación Virtual Breadboard	V4.46	

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/6.jpg)

<br>

**3.2	COMPONENTES EN VIRTUAL BREADBOARD**

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/c1.jpg)

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/c2.jpg)

<br>

**4.	EXPLICACIÓN DEL CÓDIGO FUENTE**

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/cod.jpg)

<br>

**import muvium.compatibility.arduino.Arduino;**

Esta es una biblioteca propia del simulador Virtual Bread Board, permite la que el módulo de ARDUINO sea compatible con la interfaz.

<br>

**class Sweep extends Arduino**

Con esta línea de código se inicializa una nueva clase Sweep, se le puede asignar cualquier nombre siempre que se conserve la sintaxis del programa.

<br>

**public void setup**

**pinMode(13, OUTPUT)**

Se declara el pin de salida o de respuesta en este caso el pin 13 es el que accionará al actuador dependiendo de la señal enviada por el sensor.

<br>

**public void loop**

Esta es la parte central del programa, es aqui donde se controla las variables que rigen el comportamiento de los elementos del circuito.

<br>

**float temperatura = analogRead(0)**

**float milivoltios = ( temperatura / 1023 ) * 5000**

**temperatura = milivoltios / 10**

En estas líneas de código se declaran las variables que se van a utilizar, en vista que el sensor de temperatura mide a razón de 10 mV por cada grado centígrado, declaramos las variables como float y se emplea la relación de temperatura respecto a los milivoltios para identificar el rango de medición del sensor.


<br>

**if (temperatura > 25 )** 
	
 **digitalWrite(13, HIGH)**

**else if (temperatura < 20)** 

**digitalWrite(13, LOW)**
   
 En estas líneas de código se define mediante un if-else el rango de temperatura en el que va ha operar el actuador respecto al sensor, si es mayor a 25 grados centígrados el puerto 13 se va ha activar, mientras que si la temperatura es menor a 20 grados centígrados el puerto 13 se apaga.
   
   
<br>

**5.	EJECUCIÓN DEL PROYECTO** 

<br>

El presente proyecto se basa en la simular cómo interactúan un sensor y un actuador controlados por medio de un microcontrolador ARDUINO UNO. 
El programa básicamente está compuesto por un sensor de temperatura que al momento que llega a una temperatura determinada se envía un pulso de activación para que se encienda un motor que simula el encendido de un ventilador.
Toda la simulación se realizó en Virtual Bread Board V4.46.

<br>

1.	Primero se realiza la instalación del simulador Virtual Bread Board V4.46, el instalador se lo puede descargar en el apartado instaladores del repositorio.

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e1.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e2.jpg)


<br>

2.	Se descomprime el archivo .rar y se ejecuta el instalador como administrador, el archivo contiene una carpeta crack que una vez finalizada la instalación se debe copiar y pegar en el directorio donde se instaló el programa.


<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e3.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e4.jpg)


<br>


3.	Una vez instalado el programa le damos doble clic en el icono del programa, elegimos New/OPEN y nos ubicamos en la parte superior izquierda y seleccionamos todos los elementos necesarios para la implementación del circuito, dichos elementos se encuentran listados en el apartado 3.2 COMPONENTES EN VIRTUAL BREADBOARD.

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e6.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e5.jpg)


<br>



4.	Una vez seleccionados todos los elementos se procede a realizar la conexión de los elementos según el diagrama del apartado “2. DIAGRAMA DE CONEXIÓN”



<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e7.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e8.jpg)

<br>

5.	Con todas las conexiones realizadas se procede a crear una clase que sería el módulo para la interfaz de programación, para ello dirigirse a la parte superior derecha clic derecho en New Project/Add Java Source Project/


<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e9.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e10.jpg)

<br>

6.	Se genera una ventana para la creación de una nueva clase clic en OK.


<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e11.jpg)

<br>


7.	Se puede observar que se creó un nuevo módulo Source0.SRC, damos clic derecho se este módulo y seleccionamos la opción Add New Java Source File, en la ventana emergente podemos cambiar el nombre de archivo de programación y presionamos OK.

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e12.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e13.jpg)

<br>

8.	En la hoja de código que se genera escribimos el código de programación del proyecto, este código se lo puede descargar del repositorio en la parte código fuente simplemente se copia el texto y se pega en la pantalla de programación.

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e14.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e15.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e16.jpg)

<br>

9.	Guardamos los cambios realizamos presionando el icono de guardar en la parte superior izquierda.

<br>

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e17.jpg)

<br>

<br>

10.	Finalmente, para ejecutar la simulación presionamos ejecutar que es el icono verde en forma de triángulo situado en la parte superior izquierda.

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e18.jpg)

<br>

11.	Se puede observar que la simulación empieza a ejecutarse en este caso podemos variar la temperatura del sensor moviendo el selector y observar el momento en el que se activa el motor.


<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/e19.jpg)

<br>

<br>

**6.	MANUAL DE USUARIO** 

<br>

1.	Primero se realiza la instalación y ejecución del simulador Virtual Bread Board V4.46, el instalador se lo puede descargar en el apartado instaladores del repositorio.


<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/m1.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/m7.jpg)

<br>

2.	En el repositorio en la sección código fuente descargarse el archivo de simulación.


<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/m2.jpg)

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/m2.1.jpg)

<br>

3.	Una vez abierto el simulador, seleccionar la pestaña Existing y en la barrar de direcciones ubicarse en la carpeta donde se realizó la descarga del archivo y seleccionar el archivo de simulación y darle clic en OPEN.


<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/m3.jpg)

<br>

4.	Se puede observar que el diagrama de conexión aparece en la pantalla, dicho documento ya tiene incluido el código de programación.


<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/m4.jpg)

<br>

5.	Para finalizar le damos clic en iniciar simulación, podemos observar que en efecto el programa se ejecuta sin inconveniente alguno.

<br>

![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/m5.jpg)

<br>

6.	Si deseamos variar la temperatura del sensor simplemente cambiamos la posición del indicador del sensor de temperatura y observamos que según la variación se enciendo o paga el motor.

<br>
 
 ![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/m6.jpg)
 
<br>

**7.	BIBLIOGRAFÍA**

<br>

•	Xataka Basics. (2017). ARDUINO, qué es y cómo funciona. Blog de Tecnologías de la Información. Recuperado de: https://www.xataka.com/basics/que-arduino-como-funciona-que-puedes-hacer-uno 

•	APRENDIENDO ARDUINO (2018), Sensores y Actuadores. Recuperado de: https://aprendiendoarduino.wordpress.com/2016/12/18/sensores-y-actuadores/ 

•	Filehorse. (2019). Tablero Virtual de desarrollo y simulación. Recuperado de: https://www.filehorse.com/es/descargar-virtualbreadboard/ 

