/*Implemente a classe ClasseTeste01 de forma a funcionar 
conforme a saída impressa abaixo. Ou seja, você deverá implementar 
o método m da classe ClasseTeste01 de forma que ao exercutar o 
código abaixo ele imprima conforme apresentado.
class Testa {
public static void main(String [] args) {
ClasseTeste01 oExercicio = new ClasseTeste01(); oExercicio.m(“Pedro”, 7);
oExercicio.m(“Maia”, 4);
}
.. O fragmento de código acima deve gerar a seguinte saída na tela:
Olá Pedro, você tem 7 anos. Olá Maria, você tem 4 anos.
*/

public class ClasseTeste01 {

    public void m(String nome,int idade) {
        System.out.println("Olá "+nome+", você tem "+idade+" anos.");
        //return ("Olá"+nome+", você tem"+idade+"anos.");

    }
}