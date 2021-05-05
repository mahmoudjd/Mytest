#include <iostream> 

using namespace std; 

class Book { 
	public: 
		string name ; 
		string person ; 
		int seiten ; 

		Book () { 
			name   ="" ; 
			person ="" ;
			seiten = 0 ;
		}

		Book (string aname ,string author ,int pages ) {
			name = aname ; 
			person = author ; 
			seiten = pages ; 
		}
};



int main () { 

	Book b1 ( "Harry Potter" , "JK Rowling" , 500 ) ; 

	Book b2 ( "King of the Ring" , "Tolkein " , 600 ) ;

	cout << b1.name << ", "<< b1.person << ", " << b1.seiten << endl; 
	cout << b2.name << ", "<< b2.person << ", " << b2.seiten << endl; 	

        Book b3 ; 

	cout << b3.name << ", "<< b3.person << ", " << b3.seiten << endl; 

	return 0 ; 
}
