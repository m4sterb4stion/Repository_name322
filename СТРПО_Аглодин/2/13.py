import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = ((y + (x - 1) ** (1 / 3)) ** (1 / 4)) / (
    abs(x - y) * abs(math.sin(z) ** 2 + math.tan(z))
)

print("Результат: ", round(s, 7))
