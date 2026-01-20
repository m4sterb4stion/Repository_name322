import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = 5 * math.atan(x) - 0.25 * math.acos(x) * (x + 3 * abs(x - y) + x**2) / (
    abs(x - y) * z + x**2
)

print("Результат: ", round(s, 3))
