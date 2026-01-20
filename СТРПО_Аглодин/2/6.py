import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = math.sqrt(10 * (3 * math.sqrt(x) + x**(y + 2))) * ((math.asin(z))**2 - abs(x - y))

print("Результат: ", round(s, 4))
