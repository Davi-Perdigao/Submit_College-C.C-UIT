/* 
  Implemente uma pequena aplicação para cadastro de produtos em um supermercado, com funções de incluir produto e uma opção para fazer busca pelo código do produto. Para essa aplicação você pode definir quais atributos o registro terá, qual tipo de busca e qual será o campo chave definido.
*/

#include<iostream>
#include<list>
#include<stdlib.h>

using namespace std;

class Supermercado {
  private:
    int codigo;
    string nome;
  public:
    Produto() {
      codigo = 0;
      nome = "";
    }

    void setProduto(string nome, int codigo) {
      this->nome = nome;
      this->codigo = codigo;
    }

    int getCodigo() {
      return codigo;
    }

    void printProduto() {
      cout << "Nome: " << nome << endl << "Codigo: " << codigo;
    }
};

void getProduto(int codigo, list<Produto> produto){
  for(auto p : produtos) {
    if(p.getCodigo() == codigo) {
      p.printProduto();
      return;
    }
  }
  cout << "Nao encontrado, favor cadastrar.";
}   


int main (void) {
  list<Produto> produtos;
  Produto p;

  string nome;
  int codigo;
  int result;
  bool loop = true;

  while(loop) { //MENU
    system("cls||clear");
    cout << "\tMenu" << endl
        << " 1 - Adicionar produto (nome) " << endl
        << " 2 - Pesquisar codigo produto " << endl
        << " 3 - Sair" << endl
        << "Resultado: ";
    cin >> result;

    switch (result){
    case 1:
      cout << "Nome: ";
      cin >> nome;
      cout << "Codigo: ";
      cin >> codigo; 

      p.setProduto(nome, codigo);
      produtos.push_front(p);
      break;
    case 2:
      cout << "Codigo: ";
      cin >> codigo;
      getProduto(codigo, produtos);
    case 3:
      loop = false;
      break;
    default:
      break;
    }
  }

  return 0;
}