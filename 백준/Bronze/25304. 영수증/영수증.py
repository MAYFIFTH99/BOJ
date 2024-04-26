X = int(input())

N = int(input())

c= []
for i in range(N):
    a,b = map(int,input().split())
    c.append(a*b)
for k in range(N):
    c[k] = int(c[k])

sum = 0
for j in range(N):
    sum += c[j]

if sum == X:
    print('Yes')
else:
    print('No')