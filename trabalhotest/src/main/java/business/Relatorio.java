package business;

import java.util.List;

public class Relatorio {
    public static String gerarRelatorio(List<Produto> produtos) {
        StringBuilder relatorio = new StringBuilder();
        for (Produto produto : produtos) {
            relatorio.append("Produto: ").append(produto.getNome())
                    .append(" | Preço: ").append(produto.getPreco())
                    .append(" | Quantidade: ").append(produto.getQuantidade()).append("\n");
        }
        return relatorio.toString();
    }
}
