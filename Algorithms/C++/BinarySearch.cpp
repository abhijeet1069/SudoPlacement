#include<iostream>
#include<vector>
#include<conio.h>

using namespace std;

int binarySearch(vector<int> arr, int left, int right, int key) {
	int mid = (left + right) / 2;
	if (left <= right) {
		if (key == arr[mid])
			return mid;
		else if (key < arr[mid])
			return binarySearch(arr, left, mid - 1, key);
		else
			return binarySearch(arr, mid + 1, right, key);
	}
	return -1;
}

int main() {
	vector<int> arr = { 1,22,83,97,104,108,200,210 };
	int key = 104;
	int index = binarySearch(arr, 0, arr.size() - 1 , key);
	if (index == -1)
		cout << key<<" not found!" << endl;
	else
		cout << key << " found at " << index << endl;
	getchar();
	return 0;
}
