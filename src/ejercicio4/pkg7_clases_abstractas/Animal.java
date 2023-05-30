//Clase abstracta Animal
package ejercicio4.pkg7_clases_abstractas;

public abstract class Animal {
    //Atributos
    protected String sonido;
    protected String alimento;
    protected String habitat;
    protected String nombre_cientifico;
    //Metodos publicos
    public abstract String getSonido();
    public abstract String getAlimento();
    public abstract String getHabitat();
    public abstract String getNombre_cientifico();
}
