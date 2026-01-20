import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = (
    (2 ** (y**x))
    + ((3**x) ** y)
    - (y * (math.atan(z) - 1 / 3)) / (abs(x) + 1 / (y**2 + 1))
)

print("Результат: ", round(s, 5))
