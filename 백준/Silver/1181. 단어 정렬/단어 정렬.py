N = int(input())
arr = []
for i in range(N):
    word = input()
    arr.append(word)
arr = set(arr)
arr = list(arr)
arr.sort()
arr.sort(key=len)

for i in arr:
    print(i)