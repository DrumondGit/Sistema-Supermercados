package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class SupermercadoTest {
    private Supermercado supermercado;

    @BeforeEach
    void setUp() {
        supermercado = new Supermercado();
    }

    // Testes relacionados aos produtos
    @Test
    void testCadastrarProduto() {
        supermercado.cadastrarProduto("Arroz", 5.50, 10);
        supermercado.cadastrarProduto("Feijão", 7.00, 5);

        List<Produto> produtos = supermercado.getProdutos();

        assertEquals(2, produtos.size());
        assertEquals("Arroz", produtos.get(0).getNome());
        assertEquals(5.50, produtos.get(0).getPreco());
        assertEquals(10, produtos.get(0).getQuantidade());
        assertEquals("Feijão", produtos.get(1).getNome());
    }

    @Test
    void testBuscarProduto() {
        supermercado.cadastrarProduto("Arroz", 5.50, 10);
        supermercado.cadastrarProduto("Feijão", 7.00, 5);

        Produto produtoEncontrado = supermercado.buscarProduto("Arroz");
        assertNotNull(produtoEncontrado);
        assertEquals("Arroz", produtoEncontrado.getNome());
        assertEquals(5.50, produtoEncontrado.getPreco());
        assertEquals(10, produtoEncontrado.getQuantidade());

        Produto produtoNaoEncontrado = supermercado.buscarProduto("Macarrão");
        assertNull(produtoNaoEncontrado); // Verifica se retorna null para um produto inexistente
    }

    // Testes relacionados aos clientes
    @Test
    void testCadastrarCliente() {
        supermercado.cadastrarCliente("Carlos Silva", "Rua A, 123");
        supermercado.cadastrarCliente("Maria Oliveira", "Rua B, 456");

        Cliente cliente1 = supermercado.buscarCliente("Carlos Silva");
        Cliente cliente2 = supermercado.buscarCliente("Maria Oliveira");

        assertNotNull(cliente1);
        assertEquals("Carlos Silva", cliente1.getNome());
        assertEquals("Rua A, 123", cliente1.getEndereco());

        assertNotNull(cliente2);
        assertEquals("Maria Oliveira", cliente2.getNome());
        assertEquals("Rua B, 456", cliente2.getEndereco());
    }

    @Test
    void testBuscarCliente() {
        supermercado.cadastrarCliente("Carlos Silva", "Rua A, 123");

        Cliente clienteEncontrado = supermercado.buscarCliente("Carlos Silva");
        assertNotNull(clienteEncontrado);
        assertEquals("Carlos Silva", clienteEncontrado.getNome());
        assertEquals("Rua A, 123", clienteEncontrado.getEndereco());

        Cliente clienteNaoEncontrado = supermercado.buscarCliente("João Souza");
        assertNull(clienteNaoEncontrado); // Verifica se retorna null para um cliente inexistente
    }

    // Testes relacionados aos funcionários
    @Test
    void testCadastrarFuncionario() {
        supermercado.cadastrarFuncionario("Ana Paula", "Caixa");
        supermercado.cadastrarFuncionario("João Pedro", "Estoquista");

        Funcionario funcionario1 = supermercado.buscarFuncionario("Ana Paula");
        Funcionario funcionario2 = supermercado.buscarFuncionario("João Pedro");

        assertNotNull(funcionario1);
        assertEquals("Ana Paula", funcionario1.getNome());
        assertEquals("Caixa", funcionario1.getCargo());

        assertNotNull(funcionario2);
        assertEquals("João Pedro", funcionario2.getNome());
        assertEquals("Estoquista", funcionario2.getCargo());
    }

    @Test
    void testBuscarFuncionario() {
        supermercado.cadastrarFuncionario("Ana Paula", "Caixa");

        Funcionario funcionarioEncontrado = supermercado.buscarFuncionario("Ana Paula");
        assertNotNull(funcionarioEncontrado);
        assertEquals("Ana Paula", funcionarioEncontrado.getNome());
        assertEquals("Caixa", funcionarioEncontrado.getCargo());

        Funcionario funcionarioNaoEncontrado = supermercado.buscarFuncionario("Pedro Silva");
        assertNull(funcionarioNaoEncontrado); // Verifica se retorna null para um funcionário inexistente
    }

    @Test
    void testGetFuncionarios() {
        supermercado.cadastrarFuncionario("Ana Paula", "Caixa");
        supermercado.cadastrarFuncionario("João Pedro", "Estoquista");

        List<Funcionario> funcionarios = supermercado.getFuncionarios();

        assertEquals(2, funcionarios.size());
        assertEquals("Ana Paula", funcionarios.get(0).getNome());
        assertEquals("Caixa", funcionarios.get(0).getCargo());
        assertEquals("João Pedro", funcionarios.get(1).getNome());
    }
}
