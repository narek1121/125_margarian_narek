import random

array1 = []
array2 = []

for i in range(random.randint(49,100)):
    array1.append(random.randint(-1, 9999))
    array2.append(random.randint(-1, 9999))

print(array1, array2)

common = [x for x in array1 if x in array2]

print(common)