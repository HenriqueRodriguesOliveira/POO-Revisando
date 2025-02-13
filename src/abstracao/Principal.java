package abstracao;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das Flores", "Sao Paulo", "1454", "SP",
                "48485-87", "João Paulo da Silva", "18157466", "Vendedor");
        Cliente joana = new Cliente("Rua das Rosas", "Rio de Janeiro", "RJ", "548948-84", "Joana Almeida", "48451818");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }
}
