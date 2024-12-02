package business;

public class Voucher {
    private String codigo;
    private double desconto;

    public Voucher(String codigo, double desconto) {
        this.codigo = codigo;
        this.desconto = desconto;
    }

    // Métodos de acesso
    public String getCodigo() {
        return codigo;
    }

    public double getDesconto() {
        return desconto;
    }

    // Método de operação
    public boolean validarVoucher(String codigo) {
        return this.codigo.equals(codigo);
    }
}
