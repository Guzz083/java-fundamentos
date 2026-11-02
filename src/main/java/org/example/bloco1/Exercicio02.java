package org.example.bloco1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio02 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        BigDecimal valorCompra;

        do {
            System.out.printf("Qual o valor da sua compra? %nR$ ");
            valorCompra = sc.nextBigDecimal();
            sc.nextLine();

            if (valorCompra.signum() <= 0) {
                System.out.println("Valor inválido, tente novamente");
            }
        } while (valorCompra.signum() <= 0);

        BigDecimal frete = null;

        if (valorCompra.compareTo(new BigDecimal(200)) < 0) {

            while (frete == null) {
                System.out.println("Para qual região você irá receber?");
                String regiao = sc.nextLine().trim().toLowerCase();

                frete = switch (regiao) {
                    case "norte" -> BigDecimal.ZERO;
                    case "nordeste" -> new BigDecimal(15);
                    case "sul" -> new BigDecimal(25);
                    case "sudeste" -> new BigDecimal(1000);
                    case "centro-oeste" -> new BigDecimal(30);
                    default -> {
                        System.out.println("Região indeterminada, tente novamente");
                        yield null;
                    }
                };
            }

            BigDecimal valorTotal = valorCompra.add(frete);

            System.out.println("O valor do frete é: R$ " + frete);
            System.out.println("O valor total é: R$ " + valorTotal);

        } else {
            System.out.println("Frete grátis!");
            System.out.println("O valor total é: R$ " + valorCompra);
        }
    }
}