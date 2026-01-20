num = int(input("Введите число: "))

if num <= 0:
    print("Число должно быть натуральным (num > 0)!")
else:
    total = 0
    for i in range(1, num + 1):
        total += i**3
    print(f"Сумма кубов от 1 до {num} = {total}")
