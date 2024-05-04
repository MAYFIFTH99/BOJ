A = []
def isComplete(num):
    sum = 0
    for i in range(1,num):
        if(num % i ==0 ):
            sum+=i
            A.append(i)
    if(sum == num):
        return True
    else:
        return False


while(True):
    num = int(input())
    if(num==-1):
        break
    else:
        if(isComplete(num)): # 참인경우
            print(f"{num} = ",end='')
            for i in A:
                if(i != A[len(A)-1]):
                    print(f"{i} + ",end='')
                else:
                    print(i)
        else:
            print(f"{num} is NOT perfect.")

    A.clear()