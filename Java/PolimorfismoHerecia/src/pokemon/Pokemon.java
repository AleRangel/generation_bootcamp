package pokemon;

public abstract class Pokemon {
    /* Atributos */
    private int id;
    private int edad;
    private int nivel;
    protected String nombre;
    private boolean evolucion;

    public Pokemon(int id, int edad, int nivel, String nombre, boolean evolucion){

        this.id = id;
        this.edad = edad;
        this.nivel = nivel;
        this.nombre = nombre;
        this.evolucion = evolucion;

    }

    public void comer(){
        System.out.println(getNombre()+ " esta comiendo");    
    }
    public void comer(String comida){
        System.out.println(getNombre()+ " esta comiendo" + comida);    
    }
    public void comer(String comida, int cantidad){
        System.out.println(getNombre()+ " esta comiendo " + cantidad + comida);    
    }

    public void atacar(){
        System.out.println(getNombre() + " esta atacando");
    }

    public void dormir(){
        System.out.println("Zzzz...");
    }
    
    //?Metodo abstracto define que tenga una función y el hijo se encarga de determina la función
    public abstract void saludar(String mensaje);
    
    

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEvolución(boolean evolución) {
        this.evolucion = evolución;
    }
    
    public boolean getEvolucion(){
        return evolucion;
    }
    
}
