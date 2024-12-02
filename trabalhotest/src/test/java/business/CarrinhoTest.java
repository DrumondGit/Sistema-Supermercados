package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class CarrinhoTest {
    private Carrinho carrinho;
    private Produto arroz;
    private Produto feijao;

    @BeforeEach
    void setUp() {
        carrinho = new Carrinho();
        arroz = new Produto("Arroz", 5.50, 2); // 2 unidades de Arroz a R$ 5.50 cada
        feijao = new Produto("Feijão", 7.00, 3); // 3 unidades de Feijão a R$ 7.00 cada
    }

    @Test
    void testAdicionarProduto() {
        carrinho.adicionarProduto(arroz);
        carrinho.adicionarProduto(feijao);

        List<Produto> produtos = carrinho.getProdutos();

        assertTrue(produtos.contains(arroz));
        assertTrue(produtos.contains(feijao));
        assertEquals(2, produtos.size()); // Verifica se há 2 produtos no carrinho
    }

    @Test
    void testRemoverProduto() {
        carrinho.adicionarProduto(arroz);
        carrinho.adicionarProduto(feijao);

        carrinho.removerProduto(arroz);

        List<Produto> produtos = carrinho.getProdutos();

        assertFalse(produtos.contains(arroz)); // Verifica se o arroz foi removido
        assertTrue(produtos.contains(feijao)); // Verifica se o feijão ainda está no carrinho
        assertEquals(1, produtos.size()); // Verifica se há 1 produto no carrinho
    }

    @Test
    void testGetProdutos() {
        carrinho.adicionarProduto(arroz);
        carrinho.adicionarProduto(feijao);

        List<Produto> produtos = carrinho.getProdutos();

        assertEquals(2, produtos.size());
        assertEquals(arroz, produtos.get(0));
        assertEquals(feijao, produtos.get(1));
    }

    @Test
    void testCalcularTotal() {
        carrinho.adicionarProduto(arroz); // 2 * 5.50 = 11.00
        carrinho.adicionarProduto(feijao); // 3 * 7.00 = 21.00

        double total = carrinho.calcularTotal();

        assertEquals(32.00, total, 0.01); // Total esperado: 11.00 + 21.00 = 32.00
    }
}
