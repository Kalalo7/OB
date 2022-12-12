public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Martin");
        System.out.println("Hola, mi nombre es " + persona.getNombre() + ".");
        persona.setEdad(32);
        System.out.println("Tengo " + persona.getEdad() + " años.");
        persona.setTelefono(2215480321L);
        System.out.println("Mi numero de telefono es " + persona.getTelefono() + ".");
    }
}

class Persona{
    private String nombre;
    private int edad;
    private long telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public long getTelefono() {
        return telefono;
    }
}