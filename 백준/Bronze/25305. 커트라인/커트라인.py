# N 명 응시

# k명 수상

# 커트라인 = 상을 받은 사람 중 가장 낮은 점수

N, k = map(int,input().split())

x = list(map(int,input().split()))

x.sort()
x.reverse()
print(x[k-1])