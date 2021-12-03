/*
Crie a classe Gerente que herda de Funcionario com as seguintes propriedades,
nome do departamento que é reponsável. Secretarias e Gerentes necessitam se
autenticar no sistema para terem acesso a certas informações confidenciais.
*/

public class Gerente extends Funcionario implements Prioridade {
    private String departamento;

    public final static String[] departamentos = { "RH", "Compras", "Departamento", "Pessoal" };

    public Gerente(String nome, String endereco, String codigo, Double salario, String departamento) {
        super(nome, endereco, codigo, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean autenticar(){
        if(departamento.equals("RH") || this.departamento.equals("Compras") || this.departamento.equals("Departamento Pessoal")){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String mostraTipo() {
        return "Gerente";
    }

}