package business;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    // Método para realizar um pedido
    public void fazerPedido(Pedido pedido) {
        System.out.println("Pedido realizado por: " + nome);
    }
}
