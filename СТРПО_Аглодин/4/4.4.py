nums = int(input("Введите количество чисел: "))
total = 0

for i in range(nums):
    num = int(input(f"Введите число {i+1}: "))
    total += num

print(f"Сумма всех чисел = {total}")