#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int febre,tosse,cansaco,media,contato;
	printf("0-pouco \n 1-medio \n 2-muito \n");
	printf("Informe seu nivel de febre: (0, 1 ou 2) \n");
	scanf("%i",&febre);
	printf("Informe seu nivel de tosse: (0, 1 ou 2) \n");
	scanf("%i",&tosse);
	printf("Informe seu nivel de cansaco: (0, 1 ou 2) \n");
	scanf("%i",&cansaco);
	media=(febre+tosse+cansaco)/3;
    printf("Informe se voce teve contato com outra pessoa: \n 1-Sim \n 2-Nao \n");
    scanf("%i",&contato);
    if(contato=1 && media>=1)
       printf("Voce pode estar infectado, procure um medico. \n");
    else
       if(media<1)
          printf("Voce provavelmete nao esta infectado, mas fique em casa e se cuide");
return 0;          
}
