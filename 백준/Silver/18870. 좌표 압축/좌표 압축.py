import sys

N = int(input())

A = list(map(int,sys.stdin.readline().split()))

B = sorted(list(set(A)))
dic = {B[i] : i for i in range(len(B))}


for i in A:
    print(dic[i], end = ' ')
