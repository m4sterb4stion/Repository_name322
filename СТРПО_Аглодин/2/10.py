import math

x = float(input("Введение значение переменной х: "))
y = float(input("Введение значение переменной y: "))
z = float(input("Введение значение переменной z: "))

s = (
    (2 ** (-x))
    * math.sqrt(x + 4 * math.sqrt(abs(y)))
    * math.exp((x - 1 / math.sin(z)) / 3)
)

print("Результат: ", round(s, 5))
