#include <iostream>
using namespace std;

int main() {
    int start, end, result = 0;
    cin >> start >> end;
    for (int i = start; i <= end; i++) {
        int cnt = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                cnt++;
            }
        }
        if (cnt == 3) {
            result++;
        }
    }
    cout << result;
    return 0;
}
