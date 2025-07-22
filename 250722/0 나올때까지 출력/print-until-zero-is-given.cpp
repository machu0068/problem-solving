#include <iostream>
using namespace std;

int main() {
    int n = -1;
    while (n != 0) {
        cin >> n;
        if (n == 0) {
            break;
        }
        cout << n << endl;
    }
    return 0;
}
