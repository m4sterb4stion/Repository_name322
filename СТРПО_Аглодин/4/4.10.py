num_n = int(input("Введите количество чисел: "))
num_k = int(input("Введите порядковый номер в ряду: "))

if num_n <= 0 or num_k <= 0:
    print("Оба числа должны быть положительными!")
else:
    a, b = 0, 1
    total = 0
    count = 0
    current_number = 1
    while count < num_n:
        if current_number >= num_k:
            total += a
            count += 1
        else:
            a, b = b, a + b
            current_number += 1
    print(f"\nИтоговая сумма: {total}")
