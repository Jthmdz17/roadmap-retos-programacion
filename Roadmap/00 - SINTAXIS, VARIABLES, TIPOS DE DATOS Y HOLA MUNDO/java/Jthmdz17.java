public class Jthmdz17 {
    
    /*
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

//1:  https://dev.java/learn/
//2.1: Existen 3 formas de crear comentarios con diferentes funciones
//2.1: There are 3 ways to create comments with different functions
// El primero son 2(//) barras para crear un comentario en una sola linea
// con el objetivo de dejar comentarios simples.  
// The first is 2(//) bars to create a comment on a single line
// with the aim of leaving simple comments.
//2.2: El segundo es barra asterisco, asterisco barra (/* */)
// y se usa con el objetivo de deshabilitar codigo temporalmente 
// o dar informacion del codigo de manera extensa.
//2.2: The second is slash asterisk, slash asterisk (/* */)
// and is used with the objective of temporarily disabling code 
// or give extensive code information.
//2.3: El tercero y ultimo son barra, asterisco, asterisco, asterisco barra (/** */)
// se utiliza antes de iniciar clases, atibutos, metodos y es para dar informacion tecnica.
//2.3: The third and last are slash, asterisk, asterisk, asterisk slash (/** */)
// is used before starting classes, attributes, methods and is to give technical information.


    
    //Variable
    int number1 = 1;
    //Constante
    double PI = 3.1416; 
    
    //El byte tiene un valor desde -128 a 127, solo maneja enteros
    //The byte has a value from -128 to 127, it only handles integers
    byte example1 = 127; 

    //El short tiene un valor desde -32,768 a 32,767, solo maneja enteros
    //The short has a value from -32,768 to 32,767, it only handles integers
    
    short example2 = 32767;

    //El int es un entero por defecto y es para manejar datos pequeños
    //The int is an integer by default and is for handling small data
    int example3 = 2;

    //El long es otro entero que se usa para manejar datos enormes
    //The long is another integer used to handle huge data
    long example4 = 258;

    //El float se usa con el objetivo de manejar valores decimales
    //The float is used in order to handle decimal values
    float example5 = 5.25424452777f; 

    //El double maneja valores con decimales grandes
    //The double handles values ​​with large decimal places
    double example6 = 52.588128125;

    //El boolena maneja valores de verdadero o falso
    //The boolean handles values ​​of true or false
    boolean example7 = false;

    //El char maneja carateres
    //Char handles characters
    char example8 = 'T';

    public static void main(String[] args) {
        System.out.println("¡Hola, Java!");
    }
}