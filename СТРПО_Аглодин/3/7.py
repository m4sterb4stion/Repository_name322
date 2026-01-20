year_number = int(input("Введите год: "))

if year_number % 4 == 0 and (year_number % 100 != 0 or year_number % 400 == 0):
    print(f"Год {year_number} - високосный")
else:
    print(f"Год {year_number} - не високосный")