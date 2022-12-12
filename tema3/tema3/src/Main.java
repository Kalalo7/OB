public class Main {

    public static void main(String[] args) {
        suma(20,10,5);

        Coche miCoche = new Coche();

        miCoche.agregarPuerta();
        System.out.println("El número de puertas que tiene el coche actualmente es: " + miCoche.puertas + ".");
    }

    //parte1
    public static void suma(int num1, int num2, int num3) {
        int resultado;

        resultado = num1 + num2 + num3;
        System.out.println("El resultado de la suma entre estos tres números es: " + resultado + ".");
    }
}

//parte2:
class Coche {
    public int puertas = 4;

    public void agregarPuerta() {
        this.puertas++;
    }
}