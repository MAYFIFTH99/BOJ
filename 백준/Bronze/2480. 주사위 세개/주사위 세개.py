a,b,c = map(int,input().split())

if a==b==c:
    price= 10000+(a*1000)
    print(price)

elif a!=b and a!=c and b!=c:
    price = max(a,b,c)*100
    print(price)

elif a==b and a!=c:
    price = 1000+(a*100)
    print(price)
elif b==c and b!=a:
    price= 1000+(b*100)
    print(price)
elif a==c and b!=c:
    price= 1000+(a*100)
    print(price)