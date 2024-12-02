package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Carlos Silva", "Rua A, 123");
    }

    @Test
    void testGetNome() {
        assertEquals("Carlos Silva", cliente.getNome());
    }

    @Test
    void testGetEndereco() {
        assertEquals("Rua A, 123", cliente.getEndereco());
    }
}
