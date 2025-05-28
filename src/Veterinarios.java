public class Veterinarios extends Funcionario {
    private String especializacao;
    private String tiposAnimais;

    public Veterinarios(String nome, double salario, Endereco endereco, String especializacao, String tiposAnimais) {
        super(nome, salario, endereco);
        this.tiposAnimais = tiposAnimais;
        this.especializacao = especializacao;
    }

    public String getTiposAnimais() {
        return tiposAnimais;
    }

    public String getEspecializacao() {
        return especializacao;
    }
}