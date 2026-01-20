num = int(input("Введите число для переменной num: "))
for i in range(2, num):
    if num % i == 0:
        print("Составное")
        break
else:
    print("Простое" if num > 1 else "Не простое")