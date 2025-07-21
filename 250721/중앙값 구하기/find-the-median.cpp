#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    int mid = a;
    if (b < c) {
        if (a < b) {
            mid = b;
        } else if (c < a) {
            mid = c;
        }
    } else {
        if (a < c) {
            mid = c;
        } else if (b < a) {
            mid = b;
        }
    }
    cout << mid;
    return 0;
}
