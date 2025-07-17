#include <iostream>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    int sum = a + b;
    double average = (double) sum / 2;
    cout << fixed;
    cout.precision(1);
    cout << sum << " " << average;
    return 0;
}
