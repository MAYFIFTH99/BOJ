# M : 최댓값

# 모든 점수를 /M * 100


N = int(input())

if(N<=1000):
    beforeGrade = list(map(int,input().split()))

    M = max(beforeGrade)
    i=0
    for item in beforeGrade:
        beforeGrade[i] = item/M*100
        i +=1
    average = sum(beforeGrade)/len(beforeGrade)
    print(average)

