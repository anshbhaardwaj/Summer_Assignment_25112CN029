#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    int a = 0, b = 1, next;

    if (n == 1) {
        cout << "The 1st Fibonacci term is: " << a;
    }
    else if (n == 2) {
        cout << "The 2nd Fibonacci term is: " << b;
    }
    else {
        for (int i = 3; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        cout << "The " << n << "th Fibonacci term is: " << b;
    }

    return 0;
}