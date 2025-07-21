#include <iostream>
using namespace std;

int main() {
    int a, n;
    cin >> a >> n;
    int result = a;
    for (int i = 0; i < n; i++) {
        result = result + n;
        cout << result << endl;
    }
    return 0;
}
