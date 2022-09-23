//Punto 1.
class Persona {
    //Punto 2.
    private String nombre;
    private int edad;
    private String telefono;

    //Punto 3.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
public class Tarea3 {
    //Punto 5
    public static void main (String[] args){
        //Punto 4
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(25);
        persona1.setTelefono("+5499999999");

        System.out.print(persona1.getNombre()+ "\n");
        System.out.print(persona1.getEdad()+ "\n");
        System.out.print(persona1.getTelefono()+ "\n");

    }

}
