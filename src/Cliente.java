public class Cliente {
    private String nome;
    private Pet pet;
    private Endereco endereco;

    public Cliente(String nome, Pet pet, Endereco endereco) {
        this.nome = nome;
        this.pet = pet;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}