public class Peixes extends Pet {
    private String cor;
    private double tamanho;

    public Peixes(String nome, String raca, int idade, char sexo, String cor, double tamanho) {
        super(nome, raca, idade, sexo);
        this.cor = cor;
        this.tamanho = tamanho;
    }
}
