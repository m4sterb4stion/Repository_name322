a = int(input("Введите число для переменной a: "))
b = int(input("Введите число для переменной b: "))

if a > b:
    print("Неверно введены параметры задачи - должно выполняться условие a <= b")
else:
    for i in range(a, b + 1):
        print(i, end=" ")
    print()
