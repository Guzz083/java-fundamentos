package org.example.bloco1;

public class Exercicio01 {


    static void main() {
        String nomeProduto = "notebook";
        double preco = 3500;
        int estoque = 10;
        double total = estoque * preco;
        boolean status = true;
        double ProdutoDesconto = preco - (preco * 0.1);
        String situacao = status ? "Ativo" : "Inativo";

        String nomeNovoProduto = "Mouse";
        double precoNovoProduto = 89.90;
        int estoqueNovoProduto = 25;
        double totalNovoProduto = estoqueNovoProduto * precoNovoProduto;
        boolean statusNovoProduto = false;
        double novoProdutoDesconto = precoNovoProduto - (precoNovoProduto * 0.1);
        String situacaoNovoProduto = statusNovoProduto ? "Ativo" : "Inativo";


        System.out.printf("%s | R$ %.2f | %d un. | Total: R$ %.2f%n", nomeProduto, preco, estoque, total);
        System.out.println("Status: " + situacao);
        System.out.printf("Produto com desconto 10%% de desconto: R$ %.2f%n%n", ProdutoDesconto);

        System.out.printf("%s | R$ %.2f | %d un. | Total: R$ %.2f%n", nomeNovoProduto, precoNovoProduto, estoqueNovoProduto, totalNovoProduto);
        System.out.println("Status: " + situacaoNovoProduto);
        System.out.printf("Produto com desconto 10%% de desconto: R$ %.2f", novoProdutoDesconto);

    }


}
