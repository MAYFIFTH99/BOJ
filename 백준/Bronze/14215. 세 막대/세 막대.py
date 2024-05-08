# 세 막대

a,b,c = map(int,input().split())
top_num = max(a,b,c)
middle_num = (a+b+c)-max(a,b,c)-min(a,b,c)
low_num = min(a,b,c)

if(top_num>=middle_num+low_num):
    while(top_num>=middle_num+low_num):
        top_num -=1
print(top_num+middle_num+low_num)