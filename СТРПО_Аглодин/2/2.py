import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = ((9 + (x - y) ** 2) ** (1 / 3)) / (x**2 + y**2 + 2) - math.exp(abs(x - y)) * (
    math.tan(z) ** 3
)

print("Результат: ", round(s, 5))
