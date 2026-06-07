#include <iostream>
#include <cmath>
using namespace std;

// Recursive function to reverse a number
int reverseNumber(int n, int digits)
{
    if (n == 0)
        return 0;

    return (n % 10) * pow(10, digits - 1) +
           reverseNumber(n / 10, digits - 1);
}

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int digits = 0, temp = n;

    while (temp > 0)
    {
        digits++;
        temp /= 10;
    }

    cout << "Reversed number = "
         << reverseNumber(n, digits);

    return 0;
}