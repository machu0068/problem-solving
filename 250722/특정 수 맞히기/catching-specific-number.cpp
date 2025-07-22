#include <iostream>
using namespace std;

int main() {
    int guess = 0, twenty_five = 25;
    while (guess != twenty_five) {
        cin >> guess;
        if (guess < twenty_five) {
            cout << "Higher" << endl;
        } else if (guess > twenty_five) {
            cout << "Lower" << endl;
        } else {
            cout << "Good" << endl;
            break;
        }
    }
    return 0;
}
