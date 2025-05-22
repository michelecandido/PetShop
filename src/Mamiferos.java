public class Mamiferos extends Pet {
    private boolean castracao, vacina;
    private double peso;
    private String alergias;

    public Mamiferos(String nome, String raca, int idade, char sexo, boolean castracao, boolean vacina, double peso, String alergias) {
        super(nome, raca, idade, sexo);
        this.castracao = castracao;
        this.vacina = vacina;
        this.peso = peso;
        this.alergias = alergias;
    }

    public boolean getCastracao() {
        return castracao;
    }

    public void setCastracao(boolean castracao) {
        this.castracao = castracao;
    }

    public boolean getVacina() {
        return vacina;
    }

    public void setVacina(boolean vacina) {
        this.vacina = vacina;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}