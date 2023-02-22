#Crie uma lista vazia
lista_vazia = []
#Adicione 5 elementos de uma lista de compras de supermercado
lista_inicial = ["ovo", "pão", "carne", "danoninho", "desodorante"]
#Remova o último elemento
lista_inicial.pop()
#Adicione mais 3 elementos
mais_itens = ["batata", "xuxu", "cenoura"]
nova_lista = lista_inicial + mais_itens
#Print apenas os dois primeiros elementos
print("Apenas os dois primeiros elementos: ", nova_lista[:2])
#Print apenas os 3 últimos elementos;
print("Apenas os três últimos elementos: ", nova_lista[4:7])