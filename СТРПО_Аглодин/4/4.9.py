num = int(input("Введите количество чисел: "))

if num <= 0:
    print("Количество чисел должно быть положительным!")
else:
    a, b = 0, 1
    total = 0
    print(f"Первые {num} чисел Фибоначчи:", end=" ")

    for i in range(num):
        print(a, end=" ")
        total += a
        a, b = b, a + b

    print(f"\nСумма {num} чисел Фибоначчи: {total}")
