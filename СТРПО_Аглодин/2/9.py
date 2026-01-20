import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = abs(x ** (y / x) - (y / x) ** (1 / 3)) + (y - x) * (math.cos(y) - z / (y - x)) / (
    1 + (y - x) ** 2
)

print("Результат: ", round(s, 5))
