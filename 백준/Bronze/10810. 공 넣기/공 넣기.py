N, M = map(int,input().split())

A =[0]*N

for m in range(M):
    i,j,k = map(int,input().split())
    for index in range(i-1,j):
        A[index] = k

for number in A:
    print(number,end=' ')