import random
a=[]
num1=random.randrange(4,100)
print('Введите значение х:\n ')
x=int(input())
sum=0
flag=False

for i in range(num1):
    num2=random.randrange(0,9999)
    a.append(num2)
    sum=sum+a[i]

def magic(sum,x):
    if (sum%x==0):
        flag=True
        print('Сумма чисел делится на х')
    else:
        flag=False
        print('Сумма чисел не делится на х')
magic(sum,x)