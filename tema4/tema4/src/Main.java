public class Main {
    public static void main(String[] args) {
        //if, else if y else
        int numeroIf = 0;

        if (numeroIf<0){
            System.out.println("La variable numeroIf " + numeroIf + " es negativa.");
        } else if (numeroIf > 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es positiva.");
        }
        else {
            System.out.println("La variable numeroIf es 0");
        }
        //while
        int numeroWhile = 1;

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("La variable numeroWhile ahora es: " + numeroWhile + ".");
        }

        //do while
        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile ahora es: " + numeroDoWhile + ".");
        }while(numeroDoWhile<3);

        //bucle for
        for(int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println("La variable numeroFor es " + numeroFor + ".");
        }

        //switch
        String estacion = "Otoño";

        switch (estacion) {
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación válida");
        }
    }
}