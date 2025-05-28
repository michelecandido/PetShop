public class Estoque {
    private Produto[] produtos;

    public Estoque(int quantProdutos) {
        this.produtos = new Produto[quantProdutos];
    }

    public Produto[] getProdutos() {
        return produtos;
    }
}