package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    private Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto("Arroz", 5.50, 100);
    }

    @Test
    void testGetNome() {
        assertEquals("Arroz", produto.getNome());
    }

    @Test
    void testGetPreco() {
        assertEquals(5.50, produto.getPreco());
    }

    @Test
    void testGetQuantidade() {
        assertEquals(100, produto.getQuantidade());
    }

    @Test
    void testReduzirQuantidade() {
        produto.reduzirQuantidade(10);
        assertEquals(90, produto.getQuantidade());
    }
}
