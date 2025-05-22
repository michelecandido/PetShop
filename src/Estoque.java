public class Estoque {
    private Produto[] produto;

    public Estoque(int quantidadeProdutos) {
        this.produto = new Produto[quantidadeProdutos];
    }

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }
}