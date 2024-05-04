# 소수 찾기

N = int(input())

A = list(map(int,input().split()))
cnt = 0
for i in A:
    if i ==1:
        cnt+=1
        continue
    for j in range(2,i):
        if(i%j==0):
            cnt+=1
            break
        
            
print(N-cnt)

