#include <iostream>
using namespace std;

// Recursive function to find sum of digits
int sumOfDigits(int n)
{
    if (n == 0)
        return 0;

    return (n % 10) + sumOfDigits(n / 10);
}

int main()
{
    int n;

    cout << "Enter a number: ";
    cin >> n;

    cout << "Sum of digits = " << sumOfDigits(n);

    return 0;
}