/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
 */
import java.util.Scanner;

public class Jthmdz17 {
   
    //Variable global: 
    // es aquella que se puede mandar a llamar 
    // en cualquier funcion declarandola fuera de las funciones 
    static double PI =3.1416;
    
public static void main(String[] args) {

    System.out.println("Esta es una Variable Global:"+PI);
     
    //Esta linea es una Funcion sin parametro ni retorno
    System.out.println("Bienvenidos a mi ejercicio");

    /*En Java no se pueden crear 
     funciones dentro de funciones*/
     
     /*Las variables locales son aquellas que solo se pueden usar dentro 
      de una funcion creadas en la misma*/ 

    Scanner sc = new Scanner(System.in);
    
    //Variable local 
    int mayoriaEdad = 18;
    System.out.println("Esta es una Variable local:"+ mayoriaEdad);
    //Funcion con uno o varios parametros utilizando variables locales y dando retorno     
    System.out.println("Ingrese su edad: ");
    int edad = sc.nextInt();
    if (edad >= mayoriaEdad) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }

        sc.close();

    //Funcion predeterminada de Java:
    System.out.println("Esta funcion devuelve un numero mayor");
    int Numero2 = 38;
    int Numero = 35;
    int mayor = Math.max(Numero2, Numero);
        System.out.println("Numero Mayor: " + mayor);

    }
}
