#include <iostream>
using namespace std;

int main() {
    int n, count = 0;

    cout << "Enter a number: ";
    cin >> n;

    while (n > 0) {
        count += n % 2;   // Add 1 if the last bit is set
        n /= 2;           // Remove the last bit
    }

    cout << "Number of set bits = " << count << endl;

    return 0;
}