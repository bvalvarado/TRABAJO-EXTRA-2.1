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

Es un programa para el desarrollo de circuitos digitales de factor de forma de tablero y crear el software microcontrolador que los inicia. 


![](https://github.com/bvalvarado/TRABAJO-EXTRA-2.1/blob/master/Img/4.jpg)

CARACTERÍSTICAS: 

•	Una interfaz intuitiva que podría ser utilizado fácilmente por cualquier persona que sabe lo que están haciendo.

•	Te da la oportunidad de personalizar su proyecto con varios componentes (instrumentos, temporizadores, generadores de funciones, motores, pantallas LCD / LED, y más).

•	Muestra el registro de errores, mientras que el circuito está emulando para que pueda ver lo que salió mal en tiempo real.

•	Requiere Java JRE, .NET Framework y Arduino.


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





<br>

**6.	MANUAL DE USUARIO** 

 
**7.	BIBLIOGRAFÍA**

<br>

•	Xataka Basics. (2017). ARDUINO, qué es y cómo funciona. Blog de Tecnologías de la Información. Recuperado de: https://www.xataka.com/basics/que-arduino-como-funciona-que-puedes-hacer-uno 

•	APRENDIENDO ARDUINO (2018), Sensores y Actuadores. Recuperado de: https://aprendiendoarduino.wordpress.com/2016/12/18/sensores-y-actuadores/ 

•	Filehorse. (2019). Tablero Virtual de desarrollo y simulación. Recuperado de: https://www.filehorse.com/es/descargar-virtualbreadboard/ 

