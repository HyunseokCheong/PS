#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, x;
    cin >> n >> x;
    for (int i = 0; i < n; i ++) {
        int num;
        cin >> num;
        if (num < x) {
            cout << num << ' ';
        }
    }
    return 0;
}