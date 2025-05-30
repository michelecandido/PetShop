public class Cliente {
    private String nome;
    private Endereco endereco;
    private Pet[] pets;
    private int totalPets;

    public Cliente(String nome, Endereco endereco, int quantPets) {
        this.nome = nome;
        this.endereco = endereco;
        this.pets = new Pet[quantPets];
        this.totalPets = 0;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void addPets(Pet petNovo) {
        if(totalPets < pets.length) {
            pets[totalPets] = petNovo;
            totalPets++;
        }
    }
}