public class Peixes extends Pet {
    private String tipoAgua;

    public Peixes(String nome, String raca, int idade, String tipoAgua) {
        super(nome, raca, idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }
}
