import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = (y ** (x + 1)) / ((abs(y - 2) + 3) ** (1/3)) + ((x + y/2) / (2 * abs(x + y))) * ((x + 1) ** (-1/math.sin(z)))

print("Результат: ", round(s, 4))