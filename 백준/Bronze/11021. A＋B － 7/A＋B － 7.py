n = int(input())

lst = []
for i in range(n):
    a, b = map(int,input().split())
    lst.append(a+b)


for j in range(n):
    print("Case #{1}: {0}".format(lst[j],j+1))