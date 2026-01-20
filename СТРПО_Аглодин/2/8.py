import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = (math.exp(abs(x - y)) * (abs(x - y)) ** (x + y)) / (math.atan(x) + math.atan(z)) + (
    x**6 + math.log(y) ** 2
) ** (1 / 3)

print("Результат: ", round(s, 4))
