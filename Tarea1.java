/*
Primera parte:

        Crear una función con tres parámetros que sean números que se suman entre sí.

        Llamar a la función en el main y darle valores.

Segunda parte:

        Crear una clase coche.

        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

        Una función que incremente el número de puertas que tiene el coche.

        Crear un objeto miCoche en el main y añadirle una puerta.

        Mostrar el número de puertas que tiene el objeto.
*/


public class Tarea1 {
//Primera parte
    public static void main (String[] args) {
        int resSuma;
        resSuma = suma(10, 12, 99);
        System.out.println("El resultado de la suma es: " + resSuma + ".");

//Segunda parte
        Coche auto1 = new Coche();
        auto1.AgregarPuertas();
        System.out.println("El coche tiene " + auto1.puertas + " puertas.");


    }

//Primera parte
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

//Segunda Parte
class Coche {
    public int puertas = 4;

    public void AgregarPuertas(){
        this.puertas++;
    }
}