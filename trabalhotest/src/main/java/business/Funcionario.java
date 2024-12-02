package business;

public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    // Métodos de operação
    public void receberPagamento(Pagamento pagamento) {
        System.out.println("Pagamento de " + pagamento.getValor() + " recebido por: " + nome);
    }
}
