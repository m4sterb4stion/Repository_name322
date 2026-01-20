num = input("Введите число для переменной num: ")

if '.' in num:
    print(f"Число {num} - дробное")
else:
    print(f"Число {num} - целое")