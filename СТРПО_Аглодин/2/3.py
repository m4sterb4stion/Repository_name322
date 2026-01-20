import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = ((1 + math.sin(x + y) ** 2) / (x - (2 * y) / (1 + x**2 * y**2))) * (
    x ** abs(y)
) + math.cos(math.atan(1 / z)) ** 2

print("Результат: ", round(s, 5))
