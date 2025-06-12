package controller;

import service.ProdutoService;
import model.Produto;

import java.util.List;

public class ProdutoController {
    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    public void adicionarProduto(String nome, double preco) {
        service.cadastrarProduto(nome, preco);
    }

    public List<Produto> listarProdutos() {
        return service.obterTodosProdutos();
    }
}