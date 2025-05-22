public class Cliente {
    private String nome;
    private Endereco endereco;
    private Pet[] pets;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.pets = new Pet[0];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void adicionarPet(Pet pet) {
    }
}