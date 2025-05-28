public class Cliente {
    private String nome;
    private Endereco endereco;
    private Pet[] pets;

    public Cliente(String nome, Endereco endereco, int quantPets) {
        this.nome = nome;
        this.endereco = endereco;
        this.pets = new Pet[quantPets];
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

    public boolean addPets(Pet petNovo) {
        for(int i = 0; i < pets.length; i++) {
            if(pets[i] == null) {
                pets[i] = petNovo;
                return true;
            }
        }
        return false;
    }
}