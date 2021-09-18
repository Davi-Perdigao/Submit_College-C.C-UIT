/* - Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio, excluindo o térreo, capacidade do elevador, e quantas pessoas estão presentes nele. A
classe deve também disponibilizar os seguintes métodos:
Inicializa(Construtor): que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Sobe: para subir um andar (não deve subir se já estiver no último andar);
Desce: para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).
*/

public class Elevador { 
    //Variaveis globais 
    private int nAtual, nTotal, nCapac, nPessoas; 
  
    //Classe principal 
    public Elevador(int nA, int nT, int nC, int nP) { 
      this.nAtual   = nA; 
      this.nTotal   = nT; 
      this.nCapac   = nC; 
      this.nPessoas = nP; 
    } 
  
    //Get - Capacidade 
    public int getCapac()    { 
      return this.nCapac;} 
    //Get - Pessoas presentes 
    public int getPessoas()    { 
      return this.nPessoas;} 
    //Get - Total de andares 
    public int getTotal()    { 
      return this.nTotal;} 
    //Get - Andar Atual 
    public int getAtual()    { 
      return this.nAtual;} 
  
    //Set - Pessoas Presentes 
    public void setPes(int nPe){ 
      this.nPessoas = nPe;} 
  
    //Inicializa 
    public void Inicializa(int nCap,int nTot){ 
      this.nTotal   = nTot; 
      this.nCapac   = nCap; 
    } 
  
    //Entra pessoa 
    public void Entra(){ 
      this.nPessoas+=1; 
    } 
  
    //Sai pessoa 
    public void Sai(){ 
      this.nPessoas-=1; 
    } 
  
    //Sobe de andar 
    public void Sobe(){ 
      this.nAtual+=1; 
    } 
  
    //Desce de andar 
    public void Desce(){ 
      this.nAtual-=1; 
    } 
  
  }