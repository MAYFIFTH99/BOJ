N, B = input().split()

B = int(B)
result = 0
N = N[::-1]
num_alpha_list ='0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
for index, index_num in enumerate(N):
    result += (B**index)*(num_alpha_list.index(index_num))


print(result)