public class Main {
    public static void main(String[] args) {
        //creo la clase persona
        class Persona {
            String nombre;
            int edad;
            long telefono;
        }
        // creo clase cliente
        class Cliente extends Persona {
            double credito;
        }
        class Trabajador extends Persona {
            double salario;
        }

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        //creo objeto de la clase cliente con las propiedades solicitadas
        cliente.nombre = "Martin";
        cliente.edad = 32;
        cliente.telefono = 2215480321L;
        cliente.credito = 369.45;
        System.out.println("Hola, soy " + cliente.nombre + ", tengo " + cliente.edad + " años de edad y mi numero de telefono es "+ cliente.telefono + ". Mi credito disponible es €" + cliente.credito + " euros.");

        //creo el objeto de la clase trabajador
        trabajador.nombre = "Juan Carlos";
        trabajador.edad = 35;
        trabajador.telefono = 689051847L;
        trabajador.salario = 2500;
        System.out.println("Hola, soy " + trabajador.nombre + ",tengo " + trabajador.edad + " años de edad y mi numero de telefono es " + trabajador.telefono + ". Mi Salario es de € " + trabajador.salario + " euros.");
    }
}