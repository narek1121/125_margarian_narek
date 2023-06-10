print("Укажите сумму баланса Алисы:\n")
x = int(input())
print("Укажите сумму баланса Боба:\n")
y = int(input())
print("Укажите сумму баланса Чарли:\n")
z = int(input())
print("Укажите сумму подписки:  \n")
cost = int(input())

def ntflx(x,y,z,cost):
    if (cost - (x + y) < cost - (x + z) and cost - (x + y) < cost - (y + z)):
        print('Подписку могут купить Алиса и Боб')
    if (cost - (x + z) < cost - (x + y) and cost - (x + z) < cost - (y + z)):
        print('Подписку могут купить Алиса и Чарли')
    if (cost - (y + z) < cost - (x + y) and cost - (y + z) < cost - (x + z)):
        print('Подписку могут купить Боб и Чарли')
ntflx(x,y,z,cost)