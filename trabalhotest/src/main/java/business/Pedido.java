package business;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private double total;

    public Pedido(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
        calcularTotal();
    }

    // Métodos de cálculo
    public void calcularTotal() {
        total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
    }

    public double getTotal() {
        return total;
    }

    // Métodos de acesso
    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
