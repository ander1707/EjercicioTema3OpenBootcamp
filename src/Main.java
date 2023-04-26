/* Ejercicio Tema 3
   Primera parte:
       - Crear una función con tres parámetros que sean números que se suman entre sí.
       -Llamar a la función en el main y darle valores.
   Segunda parte:
       -Crear una clase coche.
       -Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
       -Una función que incremente el número de puertas que tiene el coche.
       -Crear un objeto miCoche en el main y añadirle una puerta.
       -Mostrar el número de puertas que tiene el objeto.
 */
public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado=funcionSuma(10,20,30);
        System.out.println("Parte 1 Ejercicio Tema 3 Sumar tres parametros Numericos");
        System.out.println("La suma de los tres numeros es: "+resultado);

        coche miCoche = new coche();
        miCoche.incrementarPuertas();
        System.out.println("Parte 2 Ejercicio Tema 3 - COCHE");
        miCoche.mostrarPuertas();
        }
    public static int funcionSuma (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}