# 최댓값
A = []
for i in range(9):
    A.append(list(map(int,input().split())))


max_num = 0
max_i = 0
max_j =0

for i in range(9):
    for j in range(9):
        if max_num <= A[i][j]        :
            max_num = A[i][j]
            max_i = i+1
            max_j = j+1
print(max_num,max_i,max_j)