package eva3.pkg2.comparator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author emiliomurillo
 */
public class EVA32COMPARATOR {
    // Comparator --> Establece un criterio de ordenamiento para collections
    // Se usa para el método sort();

    public static void main(String[] args) {
        //Lista
        LinkedList<Integer> miLista = new LinkedList();
       miLista.add((int)(Math.random() * 100));
       miLista.add((int)(Math.random() * 100));
       miLista.add((int)(Math.random() * 100));
       miLista.add((int)(Math.random() * 100));
       miLista.add((int)(Math.random() * 100));
       miLista.add((int)(Math.random() * 100));
       miLista.add((int)(Math.random() * 100));
       miLista.add((int)(Math.random() * 100));
       //Ordenar --> Comparator = Es una interfaz
       Comparator ordenar = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer val1 = (Integer)o1;
                Integer val2 = (Integer)02;
                return val2 - val1;
            }
        };
       miLista.sort(ordenar);
        System.out.println(miLista);
        
        LinkedList<Persona> listaPersonas = new <Persona>LinkedList();
        listaPersonas.add(new Persona("Juan", "Perez", "Soba",50, 100.0));
        listaPersonas.add(new Persona("Pedro", "Becerra", "Gutierrez",45, 120.0));
        listaPersonas.add(new Persona("Alberto", "Martinez", "Licon",46, 135.0));
        listaPersonas.add(new Persona("Dora", "Molina", "Armendariz",40, 110.0));
        listaPersonas.add(new Persona("Estela", "Sanchez", "Baldomero",47, 140.0));
        listaPersonas.add(new Persona("Mónica", "Molina", "Rodriguez",41, 150.0));
        listaPersonas.add(new Persona("Esteban", "Antunez", "Garcia",43, 90.0));       

        //Comparator para salarios y apellido paterno
        Comparator ordenarDouble = new Comparator() {
            @Override
            public double compare(Object o1, Object o2) {
                Double val1 = (Double)o1;
                Double val2 = (Double)o2;
                return val2 - val1;
            }
        };
        listaPersonas.sort(ordenar);
        for(Iterator<Persona> iterador = listaPersonas.iterator(); iterador.hasNext();){
            Persona perso = iterador.next();
            System.out.println(perso.getNombre());
        }
        
    }
    
}

class Persona{
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private double salario;

    public Persona(String nombre, String paterno, String materno, int edad, double salario) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.salario = salario;
    }

}