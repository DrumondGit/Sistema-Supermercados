package business;

public class Pagamento {
    private double valor;
    private String metodoPagamento;
    private boolean pago;  // novo campo

    public Pagamento(double valor, String metodoPagamento) {
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.pago = false;
    }

    // Método sem retorno, mas altera o estado
    public void realizarPagamento() {
        if (valor > 0) {
            this.pago = true;
        }
    }

    public boolean isPago() {
        return pago;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public double getValor() {
        return this.valor;
    }
}
