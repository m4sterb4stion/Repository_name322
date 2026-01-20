year_number = int(input("Введите год: "))

if year_number % 100 == 0:
    print(f"Год {year_number} - вековой")
else:
    print(f"Год {year_number} - не вековой")
