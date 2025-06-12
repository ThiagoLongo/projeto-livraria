package service;

import model.Produto;
import repository.ProdutoRepository;

import java.util.List;

public class ProdutoService {
    private ProdutoRepository repository;
    private int contadorId = 1;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(contadorId++, nome, preco);
        repository.salvar(produto);
    }

    public List<Produto> obterTodosProdutos() {
        return repository.listarTodos();
    }
}