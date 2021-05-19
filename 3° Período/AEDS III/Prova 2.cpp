int busca_hash(int a[], int x, int n) {
int i, cont = 0 ;
i = hash(x);
 //procura x a partir da posição i
 while (a[i] != x) {
   if (a[i] == -1) return –1; //não achou x, pois existe uma vazia
   if (++cont == n) return –2; //a tabela está cheia
   if (++i == n) i = 0; //tabela circular
 }
//encontrou
 if(a[i] == x){
 a[i] == NULL
 }
 //excluiu o item repetido
 return i;
}