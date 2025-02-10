package associação;

import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionarios> listaDeFuncionarios;

    public Departamento(String nome, List<Funcionarios> listaDeFuncionarios) {
        this.nome = nome;
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarFuncionarios(){
        System.out.println("Departamento de " + nome);
        listaDeFuncionarios.forEach(funcionario -> System.out.println(funcionario));
    }
}
