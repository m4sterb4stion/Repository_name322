import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = (2 * math.cos(x - 2 / 3)) / (0.5 + math.sin(y) ** 2) * (1 + (z**2 / (3 - z**2 / 5)))

print("Результат: ", round(s, 6))

