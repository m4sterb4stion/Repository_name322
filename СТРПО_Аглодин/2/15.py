import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = (
    ((x ** (y + 1) + math.exp(y - 1)) / (1 + x * abs(y - math.tan(z))))
    * (1 + abs(y - x))
    + (abs(y - x) ** 2) / 2
    - (abs(y - x) ** 3) / 3
)

print("Результат: ", round(s, 6))
