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