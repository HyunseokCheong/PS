N = int(input())
score_list = []
for i in range(N):
    a, d, g = map(int, input().split())
    if a == d + g:
        score_list.append((a * (d + g)) * 2)
    else:
        score_list.append(a * (d + g))
print(max(score_list))