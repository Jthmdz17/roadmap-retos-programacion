
public class Jthmdz17 {
    public static void main(String[] args){
    
        /*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

        int nu1 = 10;
        int nu2 = 5;
        boolean nu3 = true;
        boolean nu4 = false;
        boolean nu5 = true;
        boolean nu6 = false;
        
//Operaciones Aritmeticas:
    System.out.println("Vamos a realizar operaciones aritmeticas primero:\n");
    System.out.println("El resultado de sumar 10 y 5 es:"+(nu1+nu2));
    System.out.println("El resultado de restar 10 y 5 es:"+(nu1-nu2));
    System.out.println("El resultado de multiplicar 10 y 5 es:"+(nu1*nu2));
    System.out.println("El resultado de dividir 10 y 5 es:"+(nu1/nu2));
    System.out.println("El resultado del resto de 10 y 5 es:"+(nu1%nu2));
    
//OPeradores Unarios:
    System.out.println("\nAhora haremos operaciones unarias:");
    System.out.println("Vamos a incrementar en uno al\t"+(nu1++));
    System.out.println("nu1 ahora vale\t"+nu1);
    System.out.println("Vamos en decremento en uno al\t"+(nu2--));
    System.out.println("nu2 ahora vale\t"+nu2);
    System.out.println("El 11 es mayor que 4 pero lo haremos falso:"+!(nu1>nu2));


//Operadores de relacion:
    System.out.println("\nOperadores de relacion:");
    System.out.println("El numero 11 es igual al numero 4:"+(nu1==nu2));
    System.out.println("El numero 11 es mayor que 4:"+(nu1 > nu2));
    System.out.println("El numero 11 es mayor o igual que 4:"+(nu1>=nu2));
    System.out.println("El numero 11 es menor que 4:"+(nu1<nu2));
    System.out.println("El numero 11 es menor o igual que 4:"+(nu1<=nu2));
    System.out.println("El numero 11 es distinto de 4:" + (nu1 != 10));

//Operadores de asignacion
    System.out.println("\nOperadores de asignacion:");
    System.out.println("nu1 tomara un nuevo valor al sumar 10 " + (nu1 += 10));
    System.out.println("nu1 ahora vale\t"+nu1);
    System.out.println("nu1 tomara un nuevo valor al restar 10 " + (nu1 -= 10));
    System.out.println("nu1 ahora vale\t"+nu1);
    System.out.println("nu1 tomara un nuevo valor al multiplicar 10 " + (nu1 *= 10));
    System.out.println("nu1 ahora vale\t"+nu1);    
    System.out.println("nu1 tomara un nuevo valor al dividir 10 " + (nu1 /= 4));
    System.out.println("nu1 ahora vale\t"+nu1);
    System.out.println("nu1 ahora le asignaremos el valor del resto de 27 y 2 " + (nu1 %= 2));
    System.out.println("nu1 ahora vale\t"+nu1);

    //Operadores logicos
    System.out.println("\nAhora usaremos operadores logicos");
    System.out.println("Si nu3 y nu5 son verdaderos devolvera verdadero:"+(nu3&&nu5));
    System.out.println("nu3 y nu5 son diferentes pero devolvera verdadero si al menos una es verdadera:"+(nu3||nu5));
    System.out.println("nu3 es verdadero y devolvera lo contrario:"+ !(nu3));
    
    //Operadores de control o estructuras de control
    int adulto = 18;
    int menor = 0;
    
    //If se utiliza para devolver una condicion
    System.out.println("\nAhora usaremos operadores de condicion" );
    System.out.println("Si una persona tiene 18 o mas es un adulto" );
    if (adulto >= 18) {
        System.out.println("Es un adulto");

    //If else devuleve una condicion si se cumple esta y se pueden agregar mas de una condicion
    if (adulto >= 18) {
    System.out.println("Es un adulto");
    } else {
    System.out.println("es un menor");

    }
    
    //Haremos un switch para saber que dia de la semana es
        switch (3) {
            case 1:
            System.out.println("Es LUNES");
                break;
            case 2:
            System.out.println("Es MARTES");
                break;
            case 3:
            System.out.println("Es MIÉRCOLES");
                break;
            case 4:
            System.out.println("Ees JUEVES");
                break;
            case 5:
            System.out.println("Es VIERNES");
                break;
            case 6:
            System.out.println("Es SÁBADO");
                break;
            case 7:
            System.out.println("Es DOMINGO");
                break;
            default:
            System.out.println("Solo números del 1 al 7");
        }
        
        //Usaremos el for para un conteo automatico
        System.out.println("Contador del 1 al 10");
        for (int i = 1; i <= 10; i++) {
        System.out.println("Número: " + i);
        
    }
        
    while (menor<=17){
        System.out.println("Si tienes menos de 18 aun eres menor:" + menor);
    menor ++;
    }


}

}
}


     
