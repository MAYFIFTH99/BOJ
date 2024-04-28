numberList =['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']

s = input()

sec = 0

for i in range(len(s)):
    for j in numberList:
        if(s[i] in j):
            sec += numberList.index(j) + 3
print(sec)
