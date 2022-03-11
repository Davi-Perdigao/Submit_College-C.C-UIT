'''Dada uma String, crie uma lista com todos os números contidos nela usando somente compreensão de listas.

Exemplo -
Entrada: "Isabela tem 2 pássaros e 1 cachorro"
Saída: [2, 1]'''

entrada = "Isabela tem 2 passaros e 1 cachorro"
print ([s for s in entrada if s.isnumeric()])