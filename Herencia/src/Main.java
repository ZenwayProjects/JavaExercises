public class Main {

    public static void main(String[] args) {
        Cliente pepe = new Cliente();
        Trabajador carlos = new Trabajador();

        carlos.setNombre("Carlos Perea");
        carlos.setEdad(20);
        carlos.setSalario(2000000);

        System.out.println(carlos.getNombre());
        System.out.println(carlos.getEdad());
        System.out.println(carlos.getSalario());


        pepe.setEdad(18);
        pepe.setNombre("Pedro");
        pepe.setTelefono(8888);
        pepe.setCredito(400000);

        System.out.println( pepe.getNombre());
        System.out.println( pepe.getTelefono());
        System.out.println( pepe.getEdad());
        System.out.println(pepe.getCredito());
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad){
         this.edad = edad;
    }

    public int getEdad(){
       return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    private int  credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }

}

class Trabajador extends Persona{
    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }
}