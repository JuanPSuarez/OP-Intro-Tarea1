public class Tarea2 {
    public static void main (String[] args){

        //Punto 1.
        int numeroIf = 5;
        if ( numeroIf > 0){
            System.out.println("El numero es positivo.");
        }
        else if(numeroIf == 0){
            System.out.println("El numero es 0.");
        }
        else{
            System.out.println("El numero es negativo.");
        }

        //Punto 2.

        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile += 1;
            System.out.println("numeroWhile: " + numeroWhile);
        }
        //Do While

        int numeroDoWhile = 2;
        do {
            numeroDoWhile += 1;
            System.out.println("numeroDoWhile: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        //Punto 3.
        int numeroFor = 0;
        for (int i = 0; i <= 3; i++) {
            numeroFor = i;
            System.out.println("numeroFor: " + numeroFor);
        }

        //Punto 4.
        String estacion = "verano";
        String msgE = "Estamos en ";
        switch (estacion) {
            case "Invierno":
            case "Primavera":
            case "Otoño":
            case "Verano":
                System.out.println(msgE + estacion);
                break;
            default:
                System.out.println(msgE + "alguna estacion.");
        }
    }
}
