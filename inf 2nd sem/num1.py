x = float(input("Введите скорость Джерри (м/с):\n" ))
y = float(input("Введите скорость Тома (м/с):\n"))
s = float(input("Введите начальное расстояние между ними (м):\n"))
if x <= y:
    print("Том не сможет поймать Джерри")
else:
    time = s / (x - y)
    print("Том поймает Джерри через", time, "секунд")