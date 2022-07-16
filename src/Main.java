public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(21);
        cliente.setNombre("Farid");
        cliente.setTelefono(978654312);
        cliente.setCredito(500);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(25);
        trabajador.setNombre("Ricardo");
        trabajador.setTelefono(123456789);
        trabajador.setCredito(800);
        trabajador.setSalario(2500);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getCredito());
        System.out.println(trabajador.getSalario());

    }
}

class Persona{

    public Persona(){}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{

    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Cliente{

    int salario;

    public Trabajador(){}

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}



