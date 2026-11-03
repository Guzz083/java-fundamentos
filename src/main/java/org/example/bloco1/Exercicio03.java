package org.example.bloco1;

public class Exercicio03 {
    static void main() {

        int[] avaliacao = {5, 4, 5, 3, 2, 1};
        int[] avaliacaonova = new int[4];


        boolean[] ativos = new boolean[4];
        String[] comentarios = new String[4];

        comentarios[0] = "gostei";
        comentarios[3] = "nao gostei";


        System.out.println(ativos[1]);
        System.out.println(avaliacaonova[1]);
        System.out.println(comentarios[1]);


        System.out.println("A primeira avaliação foi: " + avaliacao[0]);
        System.out.println("A ultima avaliação foi: " + avaliacao[avaliacao.length - 1]);
        System.out.println("Existem " + avaliacao.length + " avaliações");

    }
}
