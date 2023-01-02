public class Main {

    public static void main(String[] args) {

        Persona Ingeniero = new Persona();

        Ingeniero.setEdad(21);
        Ingeniero.setNombre("David");
        Ingeniero.setTel(8753545);


        System.out.println("Mi nombres es: " + Ingeniero.getNombre() + "\n" + "Mi edad es: " + Ingeniero.getEdad() + "\n" + "Mi telefono es: " + Ingeniero.getTel() );
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int tel;

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



    public void setTel(int tel){
        this.tel = tel;
    }
    public int getTel(){
        return this.tel;
    }


}
