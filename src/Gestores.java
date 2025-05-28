public class Gestores extends Funcionario {
    private String setor;

    public Gestores(String nome, double salario, Endereco endereco, String setor) {
        super(nome, salario, endereco);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
}