import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = y ** (abs(x) ** (1 / 3)) + (math.cos(y) ** 3) * (
    abs(x - y) * (1 + (math.sin(z) ** 2) / math.sqrt(x + y))
) / (math.exp(abs(x - y)) + x / 2)

print("Результат: ", round(s, 6))
