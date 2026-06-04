#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int start, end;

    cout << "Enter the starting number: ";
    cin >> start;

    cout << "Enter the ending number: ";
    cin >> end;

    cout << "Armstrong numbers between " << start << " and " << end << " are:\n";

    for (int num = start; num <= end; num++) {
        int temp = num, digits = 0;
        int sum = 0;

        int n = temp;
        while (n != 0) {
            digits++;
            n /= 10;
        }

        n = temp;
        while (n != 0) {
            int rem = n % 10;
            sum += pow(rem, digits);
            n /= 10;
        }

        if (sum == num)
            cout << num << " ";
    }

    return 0;
}