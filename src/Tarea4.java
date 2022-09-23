public class Tarea4 {
    public static void main (String[] args){
        //Punto 3.
        Cliente cliente = new Cliente();

        cliente.edad = 26;
        cliente.nombre = "Fulano";
        cliente.telefono = "+541111111";
        cliente.credito = 10000;

        System.out.print("Edad: " + cliente.edad + "\n");
        System.out.print("Nombre: " + cliente.nombre + "\n");
        System.out.print("Teléfono: " + cliente.telefono + "\n");
        System.out.print("Credito: " + cliente.credito + "\n");

        //Punto 4.

        Trabajador trabajador = new Trabajador();

        trabajador.edad = 30;
        trabajador.nombre = "Fulano";
        trabajador.telefono = "+541111111";
        trabajador.salario = 15000;

        System.out.print("Edad: " + trabajador.edad + "\n");
        System.out.print("Nombre: " + trabajador.nombre + "\n");
        System.out.print("Teléfono: " + trabajador.telefono + "\n");
        System.out.print("Salario: " + trabajador.salario + "\n");
    }
}

//Punto 1.
class PersonaTarea4 {
    PersonaTarea4 (){}

    public int edad;
    public String nombre;
    public String telefono;
}
//Punto 2.
class Cliente extends PersonaTarea4{
    Cliente(){}
    public int credito;
}
//Punto 4.
class Trabajador extends PersonaTarea4{
    Trabajador(){}
    public int salario;
}