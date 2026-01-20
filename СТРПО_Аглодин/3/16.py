num = int(input("Введите число для переменной num: "))

if num % 3 == 0 and num % 5 == 0:
    print(f"Число {num} кратно 3 и 5")
else:
    print(f"Число {num} не кратно 3 и 5")