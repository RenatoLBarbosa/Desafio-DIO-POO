import java.util.Scanner;

public class Vendedor extends Funcionario {

    private Double Comissao;
    private Long NumeroVendas;

    public Vendedor(String nome, Long cpf, Double Comissao, Long NumeroVendas) {
        super(nome, cpf);
        this.Comissao = Comissao;
        this.NumeroVendas = NumeroVendas;
    }

    public Vendedor() {
    }

    public void setComissao(Double Comissao) {
        this.Comissao = Comissao;
    }

    public void setNumvendas(Long NumeroVendas) {
        this.NumeroVendas = NumeroVendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "Nome="+getNome()+
                ", CPF="+getCpf()+
                ", Comissao=" + Comissao +
                ", NumeroVendas=" + NumeroVendas +
                '}';
    }

    @Override
    public Double CalcularSalario() {
        Vendedor v = new Vendedor();
        Double salario = v.getSalariomin() + (Comissao*NumeroVendas);
        return salario;
    }
}
