import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
   

    public static void main(String[] args) {

        Persona persona1 = new Persona("Carmen","Milan");
        Persona persona2 = new Persona("Jorge", "Rojas");
        Persona persona3 = new Persona("Damian", "Velez");
        Persona persona4 = new Persona("Maria", "Lillo");
        Persona persona5 = new Persona("Pablo", "Bustos");


        List<String> listaDePersonas = new ArrayList<>();
        listaDePersonas.add(persona1.getNombre());
        listaDePersonas.add(persona2.getNombre());
        listaDePersonas.add(persona3.getNombre());
        listaDePersonas.add(persona4.getNombre());
        listaDePersonas.add(persona5.getNombre());


        List<Persona> listaDePersonas1 = new ArrayList<>();
        listaDePersonas1.add(persona1);
        listaDePersonas1.add(persona2);
        listaDePersonas1.add(persona3);
        listaDePersonas1.add(persona4);
        listaDePersonas1.add(persona5);


        imprimirPersonas(listaDePersonas1, true);
        listaDePersonas1.sort(Comparator.comparing(Persona::getNombre));
        imprimirPersonas(listaDePersonas1, true);
        listaDePersonas1.sort(Comparator.comparing(Persona::getApellido));
        imprimirPersonas(listaDePersonas1, false);
        listaDePersonas1.sort(Comparator.comparing(Persona::getApellido).reversed());
        imprimirPersonas(listaDePersonas1, false);

    }

    private static void imprimirPersonas(List<Persona> listaDePersonas1, boolean mostrarNombres) {
        System.out.println("----------------------");
        for (int i = 0; i < listaDePersonas1.size(); i++) {

            if (mostrarNombres) {
                System.out.println(listaDePersonas1.get(i).getNombre());
            }else {
                System.out.println(listaDePersonas1.get(i).getApellido());
            }




        }
    }
}