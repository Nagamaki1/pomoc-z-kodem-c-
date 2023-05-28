#include<iostream>
#include<cstdlib>
#include<time.h>
#include<windows.h>

using namespace std;


class Wypelnianie {
public:
	
	int	wybrana, w, wiel;
	
	int *tablica = new int [wiel];
	

	void Wypelnij() {
		cin >> wiel;
		srand(time(NULL));
		for (int i = 0; i <wiel; i++) {
			
			
			
			tablica[i] = rand() % 100 + 1;
			cout << i + 1<< "=" << tablica[i] ;
			
			
		}

	}
	

	
};

class Wybieranie :public Wypelnianie {
public:
	void Wybrana() {
		cout << "Podaj element, ktory nalezy znalezc: ";
		cin >> wybrana;
		tablica[wiel] = wybrana; 
		w = 0;
		while (tablica[w] != wybrana) 
			w++; 
		if (w == wiel)
			
			cout << "Nie znaleziono szukanej wartosci\n";

		else

			cout << "Szukana wartosc znajduje sie na pozycji " << w + 1 << endl;
		delete[wiel] tablica;
	}
};

int main()
{

	Wypelnianie z1;
	z1.Wypelnij();
	Wybieranie z2;
	z2.Wybrana();
	return 0;
}