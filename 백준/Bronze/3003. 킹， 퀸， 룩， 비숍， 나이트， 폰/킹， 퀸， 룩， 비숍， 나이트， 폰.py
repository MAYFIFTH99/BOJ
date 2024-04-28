falseValue = list(map(int,input().split()))

rightValue =[1,1,2,2,2,8]

appendList = []
for i in range(len(rightValue)):
    appendList.append(rightValue[i]-falseValue[i])


for i in appendList:
    print(i,end=' ')




