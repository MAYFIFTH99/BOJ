N = int(input())


idx = 1
cnt = 1 

while idx < N:
    idx += 6*cnt
    cnt += 1
print(cnt)