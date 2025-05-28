public class Aves extends Pet {
    private String corPenas;
    private char sexo;

    public Aves(String nome, String raca, int idade, String corPenas, char sexo) {
        super(nome, raca, idade);
        this.corPenas = corPenas;
        this.sexo = sexo;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public char getSexo() {
        return sexo;
    }
}
