import sys

N = int(input())

X = [str(input()) for i in range(N)]

X = list(set(X))

X.sort()
X.sort(key=len)


for j in range(len(X)):
    print(X[j])