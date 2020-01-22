#include<iostream>
#include<string>

constexpr auto SIZE = 5;;

using namespace std;

class Stack {
public:
	int tos; //top of the stack
	int* stack = NULL;

	Stack() {
		tos = 0;
		stack = new int[SIZE];
	}

	void push(int val) {
		if (tos >= SIZE) {
			cout << "Stack Overflow!";
			return;
		}
		else {
			stack[tos] = val;
			tos++;
			
		}
	}

	int pop() {
		if (tos < 0) {
			tos = -1; //avoid if user presses multiple pop tos may get to -2,-3.. And it will to tough to push in value. Thus rendering data-structure broken
		}
		else {
			int temp = stack[tos];
			tos--;
			return temp;
		}
	}

	void printStack() {
		cout << "Stack: ";
		for (int i = 0; i < SIZE; i++)
			cout << stack[i] << " ";
		cout << endl;
	}
};


int main() {
	Stack s1; //constructor called automatically
	s1.printStack();

	Stack s2;
	for (int i = 0; i < 10; i++)
		s2.push(i * i);
	s2.printStack();
	return 0;
}


