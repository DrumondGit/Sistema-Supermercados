package business;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class PedidoTest {
    private Pedido pedido;
    private Cliente cliente;
    private Produto arroz;
    private Produto feijao;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Carlos Silva", "Rua A, 123");
        arroz = new Produto("Arroz", 5.50, 100);
        feijao = new Produto("Feijão", 7.00, 50);
        
        // Usando ArrayList para garantir compatibilidade
        List<Produto> produtos = new ArrayList<>();
        produtos.add(arroz);
        produtos.add(feijao);
        
        pedido = new Pedido(cliente, produtos);
    }

    @Test
    void testGetTotal() {
        assertEquals(900, pedido.getTotal());
    }

    @Test
    void testGetCliente() {
        assertEquals(cliente, pedido.getCliente());
    }

    @Test
    void testGetProdutos() {
        assertTrue(pedido.getProdutos().contains(arroz));
        assertTrue(pedido.getProdutos().contains(feijao));
    }
}
