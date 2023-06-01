#include <iostream>

using namespace std;

class Osoba {
	private:
		
	int Id;
	string imie;
public:
static int numer ;
	
	Osoba() {
		numer = Id;
		numer++;
		cout << "Id:"<< Id <<endl;
		cout << "Imie:"<< imie << endl;
	}
	Osoba(const Osoba&);
	Osoba& operator=(const Osoba& Id);
	
	Osoba() {
		numer++;
	}
	~Osoba() { numer--; }
};
int Osoba::numer = 0;
int main()
{
	Osoba z1;




}
