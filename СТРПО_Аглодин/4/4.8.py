num = int(input("Введите число от 1 до 9: "))

if num < 1 or num > 9:
    print("Ошибка! Число должно быть от 1 до 9")
else:
    for i in range(1, num + 1):
        for k in range(1, i + 1):
            print(k, end="")
        print()
