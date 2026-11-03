package org.example.bloco1;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    static void main() {
        ArrayList<String> listaDesejos = new ArrayList<>();
        listaDesejos.add("Café");
        listaDesejos.add("Macarrão");
        listaDesejos.add("Arroz");
        listaDesejos.add("Miojo");
        listaDesejos.add("Cigarro");

        System.out.println(listaDesejos);
        System.out.println(listaDesejos.get(0) + " e " + listaDesejos.get(listaDesejos.size() - 1));

        listaDesejos.remove(0);

        System.out.println(listaDesejos.get(0));

        listaDesejos.remove("Macarrão");

        System.out.println(listaDesejos.get(0));

        System.out.println(listaDesejos.remove("cafe"));

        System.out.println(listaDesejos.remove("Arroz"));

        System.out.println(listaDesejos.get(0));

        ArrayList<Integer> codigos = new ArrayList<>(List.of(10, 20, 30));

        codigos.remove(1);

        System.out.println(codigos);

    }
}
