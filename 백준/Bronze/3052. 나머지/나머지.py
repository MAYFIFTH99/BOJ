A = []

for i in range(10):
    n = int(input())
    A.append(n%42)

setA = set(A)

print(len(setA))