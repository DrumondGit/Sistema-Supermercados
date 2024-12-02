package business;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;

    public Supermercado() {
        produtos = new ArrayList<>();
        clientes = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }

    // Métodos relacionados aos produtos
    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    // Métodos relacionados aos clientes
    public void cadastrarCliente(String nome, String endereco) {
        Cliente cliente = new Cliente(nome, endereco);
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }

    // Métodos relacionados aos funcionários
    public void cadastrarFuncionario(String nome, String cargo) {
        Funcionario funcionario = new Funcionario(nome, cargo);
        funcionarios.add(funcionario);
    }

    public Funcionario buscarFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
