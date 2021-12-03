/*
Crie a classe Secretaria que herda de Funcionario com as seguintes propriedades, idioma falado;
*/

public class Secretaria extends Funcionario implements Prioridade {
    private String idiomaFalado;

    public final static String INGLES = "Inglês";

    public Secretaria(String nome, String endereco, String codigo, Double salario, String idiomaFalado) {
        super(nome, endereco, codigo, salario);
        this.idiomaFalado = idiomaFalado;
    }

    public String getIdiomaFalado() {
        return idiomaFalado;
    }

    public void setIdiomaFalado(String idiomaFalado) {
        this.idiomaFalado = idiomaFalado;
    }

    public boolean autenticar(){
        if(this.idiomaFalado.equals("Ingles")){
            return true;
        } else{
            return false;
        }
    }

}