#include <iostream>

using namespace std ; 

int sPlus ( int a , int b ) { 


	return a + b ;
}

int sminus (int a ,int b){
	return a - b ;
}

int smul (int a , int b) {
	return a * b ;
}
int sdurch (int a ,int b ) {
	if (a > b ) 
		return a /b ;
	return 0 ;
}

int main() {
	int x ; 
	cout << "Gib eine Zahl ein : "  ;
	cin >> x ;
	int y ; 
	cout << "Gib andere Zahl ein : ";
	cin >> y ;

	int res = sPlus(x,y) ;
	int res1 = sminus(x,y);
	int res2 = smul(x,y) ; 
	int res3 = sdurch(x,y);

	cout << "Das Ergebnis ist : "<< res<< endl;
	cout << "Das Ergebnis ist : "<< res1 << endl;
	cout << "Das Ergebnis ist : "<< res2 << endl;
	cout << "Das Ergebnis ist : "<< res3 << endl;

	return 0 ; 
}
