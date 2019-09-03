#include <iostream> 
#include<math.h>
using namespace std;

bool isPerfect(int n) {

	double sq = sqrt(n);
	if (sq - floor(sq) == 0.0)
		return true;
	else
		return false;
}

int main(){
	int n = 81;
	cout << n << " " << isPerfect(n);
	return 0;
}
