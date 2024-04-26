T = int(input())
c=[]
for i in range(T):
    a,b = map(int,input().split())
    c.append(a+b)

for j in range(T):
    print(c[j])