package view;

import controller.ProdutoController;
import model.Produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoView {
    private ProdutoController controller;
    private Scanner scanner = new Scanner(System.in);

    public ProdutoView(ProdutoController controller) {
        this.controller = controller;
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n * Livraria JaLi * ");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarProduto();
                case 2 -> listarProdutos();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void cadastrarProduto() {
        System.out.print("Nome do livro: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        controller.adicionarProduto(nome, preco);
        System.out.println("Cadastrado com sucesso!");
    }

    private void listarProdutos() {
        List<Produto> produtos = controller.listarProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Livros cadastrados:");
            produtos.forEach(System.out::println);
        }
    }
}