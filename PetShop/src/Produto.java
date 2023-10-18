import java.util.List;

abstract class Produto {

    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, String categoria, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void vender(int Quantidade) {
        if (getQuantidadeEmEstoque() >= Quantidade) {
            setQuantidadeEmEstoque(getQuantidadeEmEstoque() - Quantidade);
            System.out.println("Compra feita com sucesso");
        } else {
            System.out.println("Não é possível realizar essa venda por falta de estoque");
        }
    }
    public static void ListarMercadoriasDisponiveis(List<Produto> mercadoriasDisponiveis) {
        System.out.println("Mercadorias Disponíveis");
        for (Produto mercadorias: mercadoriasDisponiveis) {
            System.out.println("produtos: "+mercadorias.getNome());
            System.out.println("quantidade: "+mercadorias.getQuantidadeEmEstoque());
        }
    }
}
