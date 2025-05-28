public class Funcionario {
    private String nome;
    private double salario;
    private Endereco endereco;

    public Funcionario(String nome, double salario, Endereco endereco) {
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}