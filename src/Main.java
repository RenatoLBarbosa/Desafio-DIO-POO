public class Main {
    public static void main(String[] args) {
        Vendedor funcionario1 = new Vendedor("Renato",45555512358L,500.00,5L);
        Consultor funcionario2 = new Consultor("Julia",45555512359L,28.80,280L);

        System.out.println(funcionario1);
        System.out.println(funcionario2);

        System.out.println("Salário do "+funcionario1.getNome() +" é de : R$"+funcionario1.CalcularSalario());
        System.out.println("Salário do "+funcionario2.getNome() +" é de : R$"+funcionario2.CalcularSalario());
    }
}