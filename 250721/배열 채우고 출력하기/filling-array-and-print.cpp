#include <iostream>
using namespace std;

int main() {
    char chars[10] = {' '};
    char c;
    for (int i = 0; i < 10; i++) {
        cin >> c;
        chars[i] = c;
    }
    for (int i = 10; i > 0; i--) {
        cout << chars[i - 1];
    }
    return 0;
}
