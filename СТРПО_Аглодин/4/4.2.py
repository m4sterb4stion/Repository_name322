a = int(input("Введите число для переменной a: "))
b = int(input("Введите число для переменной b: "))

if a > b:
    for i in range(a, b - 1, -1):
        print(i, end=" ")
    print()
elif a < b:
    for i in range(a, b + 1):
        print(i, end=" ")
    print()
else:
    print("Oшибка! a не может быть равно b")
