public class Mamiferos extends Pet {
    private double peso;
    private boolean castrado;
    private char sexo;

    public Mamiferos(String nome, String raca, int idade, double peso, boolean castrado, char sexo) {
        super(nome, raca, idade);
        this.peso = peso;
        this.castrado = castrado;
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public char getSexo() {
        return sexo;
    }
}
