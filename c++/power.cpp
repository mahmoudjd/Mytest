#include <iostream> 

using namespace std ; 

double power ( int n, int y ) {

 	if (y == 0 ) 
 
     		return 1 ;

	else {

		return n*power ( n ,y -1) ; 

	}

}

int main () { 

	int x , y ; 

	cout << "Gib deine Nummern ein :" ;

	cin >> x >> y ; 

	cout << "das result von " << x << " hoch "<< y << " ist : " << power(x,y)<< endl ;

  	return 0 ;

}


