 #include <iostream> 
using namespace std ; 

void love (string name , int alt) { 
	cout << "dein Name ist "<< name << ", und du bist "<< alt << " Jahre alt." << endl ; 
}
int main() { 
	string name ;
        int alt ; 	
	cout << "Gib deinen Name ein : " ;
	getline (cin , name ) ;
	cout << "Gib deinen Alter ein : " ; 
        cin >> 	alt ;

	love( name , alt) ; 
	return 0 ; 
}

