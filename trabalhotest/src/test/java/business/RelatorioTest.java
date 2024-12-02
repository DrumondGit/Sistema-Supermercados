package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {
    private Supermercado supermercado;

    @BeforeEach
    void setUp() {
        supermercado = new Supermercado();
        supermercado.cadastrarProduto("Arroz", 5.50, 100);
        supermercado.cadastrarProduto("Feijão", 7.00, 50);
    }

    @Test
    void testGerarRelatorio() {
        String relatorio = Relatorio.gerarRelatorio(supermercado.getProdutos());
        assertTrue(relatorio.contains("Arroz"));
        assertTrue(relatorio.contains("Feijão"));
    }
}
