s = input()

lowerCase = 'abcdefghijklmnopqrstuvwxyz'

# s = baekjoon
for item in lowerCase:
    if(item in s):
        print(s.index(item),end = ' ')
    else:
        print(-1,end= ' ')
    