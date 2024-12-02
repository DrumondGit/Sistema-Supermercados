package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class PagamentoTest {
    private Pagamento pagamento;
    private Pedido pedido;

    @BeforeEach
    void setUp() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 5.50, 100));  // Adicionando produto à lista
        pedido = new Pedido(new Cliente("Carlos Silva", "Rua A, 123"), produtos);
        pagamento = new Pagamento(pedido.getTotal(), "Cartão de Crédito");
    }

    @Test
    void testGetMetodoPagamento() {
        assertEquals("Cartão de Crédito", pagamento.getMetodoPagamento());
    }

    @Test
    void testRealizarPagamento() {
        pagamento.realizarPagamento();
        assertTrue(pagamento.isPago()); // Verifica se o pagamento foi realizado com sucesso
    }
}
