#include <iostream>
#include <string>

using namespace std;

class Notatka {
private:
	static int number ;
	int Ide;
public:
	string tytul, tresc;

	Notatka(string ty="tytul", string tr ="tresc") {
		ty = tytul;
		tr = tresc;
		number++;
		Ide = number;
		

		
	}
	void wpis() {
		cout << "Wpisz tytul:" << endl;
		cin >> tytul;
		cout << "Wpisz tresc:" << endl;
		cin >> tresc;
	}
	void wyswietl() {
		cout << number << endl;
		cout << Ide << endl;
		cout << tytul << endl;
		cout << tresc;
	}
	void diagnos() {

	}
	
	
};
int Notatka::number = 0;
int main()
{
	Notatka z1;
	Notatka z2;
	z1.wpis();
	z1.wyswietl();
	z2.wpis();
	z2.wyswietl();
	return 0;
}

