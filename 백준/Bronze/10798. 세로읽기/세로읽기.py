a = []

while len(a) < 5:
    string = input()
    if 1 <= len(string) <= 15:
        a.append(string)
        
b=[]
max_length = max(len(s) for s in a)
for i in range(max_length):
    for j in range(5):
        try:
            b.append(a[j][i]) 
        except:
            continue

c = ''.join(b)
print(c)