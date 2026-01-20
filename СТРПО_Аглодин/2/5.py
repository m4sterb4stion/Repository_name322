import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = math.log(y ** (-math.sqrt(abs(x)))) * (x - y / 2) + (math.sin(math.atan(z))) ** 2

print("Результат: ", round(s, 3))
