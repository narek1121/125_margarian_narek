def eqv(a,b,c):
    return((max (a,b) * 0.01)==(c-(a+b)))
a = float(input("Введите число а:\n"))
b = float(input("Введите число b:\n"))
c = float(input("Введите их сумму:\n"))

print(eqv(a, b, c))