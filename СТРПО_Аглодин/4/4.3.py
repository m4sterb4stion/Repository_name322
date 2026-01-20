a = int(input("Введите число для переменной a: "))
b = int(input("Введите число для переменной b: "))

if a <= b:
    print("Неверно введены параметры задачи - должно выполняться условие a > b")
else:
    odd = a if a % 2 != 0 else a - 1
    while odd >= b:
        print(odd, end=" ")
        odd -= 2
    print()
