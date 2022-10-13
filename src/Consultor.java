public class Consultor extends Funcionario {

    private Double ValorHora;
    private Long HorasTrabalhadas;

    public Consultor(String nome, Long cpf, Double valorHora, Long HorasTrabalhadas) {
        super(nome, cpf);
        this.ValorHora = valorHora;
        this.HorasTrabalhadas = HorasTrabalhadas;
    }
    public void setValorHora(Double valorHora) {
        ValorHora = valorHora;
    }

    public void setHorasTrabalhadas(Long HorasTrabalhadas) {
        HorasTrabalhadas = HorasTrabalhadas;
    }
    @Override
    public String toString() {
        return "Consultor{" +
                "Nome=" + getNome() +
                ", CPF=" + getCpf() +
                ", ValorHora=" + ValorHora +
                ", HorasTrabalhadas=" + HorasTrabalhadas +
                '}';
    }

    public Consultor() {
    }

    @Override
    public Double CalcularSalario() {
        return ValorHora * HorasTrabalhadas;
    }
}
