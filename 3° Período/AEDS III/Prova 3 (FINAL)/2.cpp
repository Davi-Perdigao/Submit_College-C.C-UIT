/*Crie uma classe para armazenar dados de um ESTACIONAMENTO. Ela deve ser capaz de armazenar o número da placa do carro, a marca, a hora de entrada e a hora de saída do estacionamento.
a) Crie um método (função membro) para solicitar os dados de um carro para o usuário (utilize as funções da classe tempo para pedir a hora de entrada e saída).
b) Crie um método (função membro) para imprimir os dados de um carro.
c) Admita que o estacionamento cobra R$ 8,00 a hora. Escreva um método (função membro) que imprima o valor cobrado. Considere para o cálculo a fração da hora/valor cobrado.*/

#include <iostream> 
#include <string>
using namespace std;

class Estacionamento{
	
    public:
        string placa;
        string marca;
        int entrada;
        int saida;
    public:
        Estacionamento(){
            placa = "";
            marca = "";
            entrada = 0;
            saida = 0;
        }
        void setPlaca(string placa){
            this->placa = placa;
        }
        void setMarca(string marca){
            this->marca = marca;
        }
        void setEntrada(int entrada){
            this->entrada = entrada;
        }
        void setSaida(int saida){
            this->saida = saida;
        }

        string getPlaca(){
            return this->placa;
        }
        string getMarca(){
            return this->marca;
        }
        int getEntrada(){
            return this->entrada;
        }
        int getHoraSaida(){
            return this->saida;
        }
        void cadastro(string placa, string marca, int entrada, int saida){
        	
            this->placa = placa;
            this->marca = marca;
            this->entrada = entrada;
            this->saida = saida;
        }
        void imprimir(){
        	cout<<"\nPlaca: "<<placa<<endl;
			cout<<"Marca: "<<marca<<endl;
        	cout<<"Entrada: "<<entrada<<endl;
        	cout<<"Saida: "<<saida<<endl;
        	cout<<endl;
        	        	
		}
		void valorCobrado(){
			int total;
			total = (saida - entrada) * 8;
			cout<<"Valor Cobrado: "<<total<<endl;
		}
};

//Cadastro de informações do carro

int main(void){
	
    Estacionamento carro; 
    
    string placa, marca;
	int entrada, saida;
	
    cout<<"Entre com a placa do veiculo: "<<endl;
    cin>>placa;

    cout<<"\nMarca do veiculo: "<<endl;
    cin>>marca;

    cout<<"\nHora de entrada: "<<endl;
    cin>>entrada;

    cout<<"\nHora de saida: "<<endl;
    cin>>saida;
    
    carro.cadastro(placa, marca, entrada, saida);
    carro.imprimir();
    carro.valorCobrado();
    return 0;
}