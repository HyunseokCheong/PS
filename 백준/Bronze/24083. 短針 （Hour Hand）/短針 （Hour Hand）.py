a = int(input())
b = int(input())
c = (a + b) % 12
if c == 0:
    print(12)
else:
    print(c)