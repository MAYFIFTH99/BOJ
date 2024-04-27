
N ,M = map(int,input().split())

A = list(i+1 for i in range(N))
for i in range(M):
    i, j = map(int,input().split())
    A[i-1:j] = A[i-1:j][::-1]


for value in A:
    print(value,end=' ')
