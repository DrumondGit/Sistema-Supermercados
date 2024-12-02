package business;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um supermercado
        Supermercado supermercado = new Supermercado();

        // Cadastrando produtos
        supermercado.cadastrarProduto("Arroz", 5.50, 100);
        supermercado.cadastrarProduto("Feijão", 7.00, 50);
        supermercado.cadastrarProduto("Macarrão", 3.20, 150);
        supermercado.cadastrarProduto("Óleo", 6.30, 80);

        // Cadastrando clientes
        supermercado.cadastrarCliente("Carlos Silva", "Rua A, 123");
        supermercado.cadastrarCliente("Ana Costa", "Rua B, 456");

        // Cadastrando funcionários
        supermercado.cadastrarFuncionario("João Souza", "Caixa");
        supermercado.cadastrarFuncionario("Maria Oliveira", "Gerente");

        // Criando carrinhos de compras
        Cliente cliente1 = supermercado.buscarCliente("Carlos Silva");
        Cliente cliente2 = supermercado.buscarCliente("Ana Costa");

        Produto arroz = supermercado.buscarProduto("Arroz");
        Produto feijao = supermercado.buscarProduto("Feijão");
        Produto macarrao = supermercado.buscarProduto("Macarrão");

        Carrinho carrinho1 = new Carrinho();
        Carrinho carrinho2 = new Carrinho();

        // Adicionando produtos ao carrinho de Carlos Silva
        carrinho1.adicionarProduto(arroz);
        carrinho1.adicionarProduto(macarrao);

        // Adicionando produtos ao carrinho de Ana Costa
        carrinho2.adicionarProduto(feijao);
        carrinho2.adicionarProduto(macarrao);

        // Criando pedidos para cada cliente
        List<Produto> produtosCliente1 = new ArrayList<>();
        produtosCliente1.add(arroz);
        produtosCliente1.add(macarrao);
        Pedido pedido1 = new Pedido(cliente1, produtosCliente1);

        List<Produto> produtosCliente2 = new ArrayList<>();
        produtosCliente2.add(feijao);
        produtosCliente2.add(macarrao);
        Pedido pedido2 = new Pedido(cliente2, produtosCliente2);

        // Imprimindo o total de cada pedido
        System.out.println("Total do pedido de Carlos Silva: " + pedido1.getTotal());
        System.out.println("Total do pedido de Ana Costa: " + pedido2.getTotal());

        // Realizando pagamentos
        Pagamento pagamento1 = new Pagamento(pedido1.getTotal(), "Cartão de Crédito");
        Pagamento pagamento2 = new Pagamento(pedido2.getTotal(), "Dinheiro");

        pagamento1.realizarPagamento();
        pagamento2.realizarPagamento();

        // Gerando relatório de produtos no supermercado
        String relatorio = Relatorio.gerarRelatorio(supermercado.getProdutos());
        System.out.println("\nRelatório de Produtos:");
        System.out.println(relatorio);

        // Simulando estoque
        Estoque estoque = new Estoque();
        estoque.adicionarProduto("Arroz", 100);
        estoque.adicionarProduto("Feijão", 50);
        estoque.reduzirProduto("Arroz", 10);

        System.out.println("\nEstoque após redução do Arroz:");
        System.out.println("Quantidade de Arroz: " + estoque.verificarQuantidade("Arroz"));
    }
}
