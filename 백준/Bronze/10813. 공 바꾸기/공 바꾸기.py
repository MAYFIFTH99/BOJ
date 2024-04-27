N , M = map(int,input().split())

bascket = []

for c in range(N):
    bascket.append(c+1)
# bascket = [1,2,3 ... N]

for m in range(M):
    a,b = map(int,input().split())
    exa = bascket[a-1]
    bascket[a-1] = bascket[b-1]
    bascket[b-1] = exa 


for l in range(len(bascket)):
    print(bascket[l],end= ' ')

