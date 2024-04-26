c = []
while (True):
    a,b = map(int,input().split())
    if a==0 and b==0:
        break
    c.append(a+b)

for j in range(len(c)):
    print(c[j])