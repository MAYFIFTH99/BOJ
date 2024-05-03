T = int(input())

for i in range(T):
    N = int(input())
    for j in [25,10,5,1]:
        print(N//j,end=' ')
        N = N%j
    print()