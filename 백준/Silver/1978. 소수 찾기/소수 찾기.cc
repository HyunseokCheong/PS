#include <bits/stdc++.h>

using namespace std;

bool isprime(int n) {
    if (n == 1) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int main() {
    int n, cnt = 0;
    cin >> n;
    while (n--) {
        int num;
        cin >> num;
        cnt += isprime(num);
    }
    cout << cnt << '\n';
}