public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe (String nome, int numpatas, float comprimento, float velmedia, String cor, String ambiente){
        super(nome, numpatas, comprimento, velmedia, cor, ambiente);
        setCaracteristicas(caracteristicas);
    }

    public String getCaracteriticas(){
        return caracteristicas;
    }

    private void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    public String dadosPeixe(){
        return  "Nome: " +getNome()+
                "/nNumero de Patas: " +getNumpatas()+
                "/nComprimento: " +getComprimento()+
                "/nVelocidade Media: " +getVelmedia()+
                "/nCor: " +getCor()+
                "/nAmbiente: " +getAmbiente();
    }

}