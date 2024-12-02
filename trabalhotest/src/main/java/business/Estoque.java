package business;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Integer> estoque;

    public Estoque() {
        estoque = new HashMap<>();
    }

    // Métodos para gerenciar o estoque
    public void adicionarProduto(String nome, int quantidade) {
        estoque.put(nome, estoque.getOrDefault(nome, 0) + quantidade);
    }

    public void reduzirProduto(String nome, int quantidade) {
        if (estoque.containsKey(nome) && estoque.get(nome) >= quantidade) {
            estoque.put(nome, estoque.get(nome) - quantidade);
        } else {
            throw new IllegalArgumentException("Estoque insuficiente para o produto " + nome);
        }
    }

    // Método de acesso
    public int verificarQuantidade(String nome) {
        return estoque.getOrDefault(nome, 0);
    }
}
