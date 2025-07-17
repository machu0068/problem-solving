#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    int sum = a + b + c;
    double average = (double) sum / 3;
    cout << sum;
    cout << "\n";
    cout << average;
    cout << "\n";
    cout << sum - average;
    return 0;
}
