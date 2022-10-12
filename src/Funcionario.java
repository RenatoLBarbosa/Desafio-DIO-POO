public abstract class Funcionario {
    private String Nome;
    private Long Cpf;

    private static Double salariomin = 1200.00; /// imp scanner para recber o valor do minimo

    public Funcionario(String nome, Long cpf) {
        this.Nome = nome;
        this.Cpf = cpf;
    }

    public Funcionario() {
    }
    public abstract Double CalcularSalario();

    public String getNome() {
        return Nome;
    }

    public Long getCpf() {
        return Cpf;
    }

    public static Double getSalariomin() {
        return salariomin;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setCpf(Long cpf) {
        this.Cpf = cpf;
    }
}
