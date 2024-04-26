A, B = map(int,input().split())

C = int(input())

if B+C >=60:
    D =(B+C)%60
    E = (B+C)//60
    A = A+E
    if A >= 24:
        A = A- 24
        print(A,D)
    else:
        print(A,D)
else:
    print(A,B+C)