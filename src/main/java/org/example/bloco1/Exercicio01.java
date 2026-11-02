package org.example.bloco1;

public class Exercicio01 {


    static void main() {
        String produto = "notebook";
        double preco = 3500;
        int estoque = 10;
        double total = estoque * preco;
        boolean status = true;
        double ProdutoDesconto = (preco*0.1)+preco;
        String situacao = status ? "Ativo" : "Inativo";

        System.out.printf("%s | R$ %.2f | %d un. | Total: R$ %.2f%n", produto, preco, estoque, total);
        System.out.println("Status: " + situacao);
        System.out.printf("Produto com desconto 10%% de desconto: R$ %.2f", ProdutoDesconto);

    }


}
