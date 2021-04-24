#include<stdlib.h>
#include<stdio.h>
#include<list>
#include<algorithm>

using namespace std;

list<double> addnum(list<double> list, double num){
    list.push_back(num);
    return list;
}
bool numexist(list<double> list, double num){
    std::list<double>::iterator pont;
    
    pont = find(list.begin(), list.end(), num);

    if(num == *pont) return true;
    return false;
}
list<double> get(list<double> list2, list<double> list1){ //Lista Nova
    for(auto auxI : list2){ //Lista Antiga
        int countOdd = 0;
        
        for(auto auxJ : list2){
            if(auxJ == auxI){
                countOdd++;
            }
        }
        if(countOdd%2 != 0 && !numexist(list1, auxI)){
            list1.push_back(auxI);
        }
    }
    return list1;
}
void printList(list<double> list){
    for(auto aux : list){
        printf("%d", aux);
    }
}

int main (void) {
    int sizeList = 0;
    double auxNum = 0;
    list<double> oddslist;
    list<double> list;

    do{
        list.clear();
        oddslist.clear();

        printf("\nTamanho da lista que voce deseja: ");
        scanf("%i", &sizeList);

        for(int i = 0; i < sizeList; i++){
            printf("\nInsira o %d numero: ", i+1);
            scanf("%d", &auxNum);

            list = addnum(list, auxNum);
        }
        printf("Lista: ");
        printList(list);

        oddslist = get(list, oddslist);

        printf("\nNumeros sem par: ");
        printList(oddslist);
        printf("\n");

    } while(sizeList>0);
    system("pause");
    return 0;
}
