package org.example.bloco1;

import java.util.Scanner;

public class Exercicio05 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        double compra = 0;
        int parcela = 0;
        double ValorParcela = 0;

        System.out.printf("Qual o valor da sua compra? %nR$ ");
        compra = sc.nextDouble();

        while (parcela < 1 || parcela > 12) {
            System.out.println("Em quantas vezes você quer parcelar?");
            parcela = sc.nextInt();

            ValorParcela = switch (parcela) {

                case 1 -> (compra / 1);
                case 2 -> (compra / 2);
                case 3 -> (compra / 3);
                case 4 -> (compra / 4);
                case 5 -> (compra / 5);
                case 6 -> (compra / 6);
                case 7 -> (compra / 7) + (compra * 0.001);
                case 8 -> (compra / 8) *  (compra * 0.0011);
                case 9 -> (compra / 9) * (compra * 0.0012);
                case 10 -> (compra / 10) * (compra * 0.0013);
                case 11 -> (compra / 11) * (compra * 0.0014);
                case 12 -> (compra / 12) * (compra * 0.0015);
                default -> {
                    System.out.println("Só é possivel parcelar até 12 vezes");
                    yield 0;
                }


            };

        }

        System.out.println("sua parcela será de: " + ValorParcela);
        System.out.println("O total a pagar será de: " + ValorParcela*parcela);

    }
}
