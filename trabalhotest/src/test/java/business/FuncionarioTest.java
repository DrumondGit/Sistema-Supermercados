package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    private Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("João Souza", "Caixa");
    }

    @Test
    void testGetNome() {
        assertEquals("João Souza", funcionario.getNome());
    }

    @Test
    void testGetCargo() {
        assertEquals("Caixa", funcionario.getCargo());
    }
}
