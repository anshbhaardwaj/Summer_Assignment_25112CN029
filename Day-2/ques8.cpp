#include <iostream>
using namespace std;

int main() {
    int num, original, reverse = 0, digit;

    cout << "Enter a number: ";
    cin >> num;

    original = num;

    while (num != 0) {
        digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
    }

    if (original == reverse)
        cout << original << " is a Palindrome Number";
    else
        cout << original << " is not a Palindrome Number";

    return 0;
}