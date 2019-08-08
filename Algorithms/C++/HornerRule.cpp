#include<iostream>
#include<vector>
#include<conio.h>

using namespace std;

//x^4 + 2x^3 + 1 = 1x^4 + 2x^3 + 0x^2 + 0x^1 +1x^0

int hornerRule(int x, vector<int> coeff){
	int res = coeff[0];
	for (int i = 1; i < coeff.size(); i++)
		res = x*res + coeff[i];
	return res;
}

int main() {
	vector<int> coeff = { 1, 2, 0, 0, 1 };
	cout << hornerRule(5, coeff);
	getchar();
	return 0;
}
