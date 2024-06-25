package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //EQUALS SENDO UTILIZADO
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("FORD"));
        listaCarros.add(new Carro("HYUNDAI"));
        listaCarros.add(new Carro("FERRARI"));
        listaCarros.add(new Carro("BUGGATI"));
        listaCarros.add(new Carro("SAVERO"));
        System.out.println(listaCarros.contains(new Carro("FORD")));
        System.out.println(listaCarros.contains(new Carro("SANDERO")));

        //HASHCODE SENDO UTILIZADO

        System.out.println(new Carro("FORD").hashCode());
        System.out.println(new Carro("BUGGATI").hashCode());

        Carro carro1 = new Carro("FORD");
        Carro carro2 = new Carro("FERRARI");

        System.out.println(carro1.equals(carro2));
    }
}
