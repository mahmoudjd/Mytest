# include <stdio.h>
# include <stdlib.h>

int schalt ( int  jahr ){
	if (jahr % 4 != 0 )
		return 0;
	if(jahr % 100 == 0){
		if ( jahr % 400 == 0 )
			return 1; 
		else  
			return 0;
	}
	return 1;
}

int main (){
	int year;
	printf("Bitte geben Sie das Jahr : ");
	scanf("%d", &year);

	if (schalt(year) == 1)
	    printf("Das Jahr %d ist Schaltjahr!\n",year);
	else 
		printf("Das Jahr %d ist kein Schaltjahr!\n",year);

	return 0;
}
