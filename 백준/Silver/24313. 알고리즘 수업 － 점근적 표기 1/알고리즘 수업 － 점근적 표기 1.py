a1, a0 = map(int,input().split())

c = int(input())
n0 = int(input())

def f():
    return a1*n0+a0

def g():
    return c*n0

if(f()<=g() and a1<=c):
    print(1)
else:
    print(0)

