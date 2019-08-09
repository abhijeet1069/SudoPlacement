#include<iostream>
#include<vector>
#include<conio.h>

using namespace std;

int gcdExtended(int a, int b, int *x, int *y){
	 
	if (a == 0)	{
		*x = 0;
		*y = 1;
		return b;
	}
	int x1, y1;  
	int gcd = gcdExtended(b%a, a, &x1, &y1);

	*x = y1 - (b / a) * x1;
	*y = x1;

	return gcd;
}

int main() {
	int x, y;
	cout << gcdExtended(5, 7, &x, &y) << endl;
	cout << x << " " << y; // O/P = gcd=1, x=3, y=-2
	getchar();
	return 0;
}
