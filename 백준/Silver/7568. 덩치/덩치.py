n = int(input())
arr = []

for i in range(n):
    a, b = map(int, input().split())
    arr.append((a, b))

for i in range(n):
    tmp = 1
    for j in range(n):
        if arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]:
            tmp += 1
    print(tmp, end=" ")
