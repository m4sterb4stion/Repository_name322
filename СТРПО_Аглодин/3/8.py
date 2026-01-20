month_number = int(input("Введите номер месяца: "))

months_31 = [1, 3, 5, 7, 8, 10, 12]
months_30 = [4, 6, 9, 11]

if month_number in months_31:
    print(f"В месяце под номером {month_number} - 31 день")
elif month_number in months_30:
    print(f"В месяце под номером {month_number} - 30 дней")
else:
    print(f"В месяце под номером {month_number} - 28 или 29 дней")
