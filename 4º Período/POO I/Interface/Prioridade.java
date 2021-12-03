/*
Crie uma interface de nome Prioridade com o seguinte método: public boolean
autentica().
Faça com que as classes Cliente, Secretaria e Gerente implementem esta
interface. No método autentica no caso das Secretarias, retornar true se a
secretária fala Inglês caso contrário, retornar false. Para Gerentes,
retornar true para Gerentes os departamentos: RH, Compras e Departamento
Pessoal , caso contrário, retornar false. Para clientes, retornar true se
estiver ativo, caso contrário, retornar false.
*/

public interface Prioridade {
    public boolean autenticar();
}