package ejercicio4.pkg7_clases_abstractas;

public class Ejercicio47_clases_abstractas {


    public static void main(String[] args) {
        int i;
        //Crear objetos animales
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Leon();
        animales[2] = new Perro();
        animales[3] = new Lobo();
        //Ciclo para imprimir atributos
        for (i=0;i<=3;i++){
            System.out.print("Su sonido es: ");
            System.out.println(animales[i].getSonido());
            System.out.print("Su alimentacion es: ");
            System.out.println(animales[i].getAlimento());
            System.out.print("Su habitat es: ");
            System.out.println(animales[i].getHabitat());
            System.out.print("Su nombre cientifico es: ");
            System.out.println(animales[i].getNombre_cientifico());
            System.out.println("");
        }
        
        
        
    }
    
}
