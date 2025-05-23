public class Pet {
    private String nome, raca;
    private int idade;

    public Pet(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        if(idade < 1) {
            return "Nome do Pet: "+nome+
                   "\nRaça: "+raca+
                   "\nIdade: menos de 1 ano";
        }
        return "Nome do Pet: "+nome+
               "\nRaça: "+raca+
               "\nIdade: "+idade+" anos";
    }
}