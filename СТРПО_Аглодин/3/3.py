num = int(input("Введите число для переменной num: "))
even_nums = []
odd_nums = []
num_str = str(abs(num))

for list_char in num_str:
    list_num = int(list_char)
    if list_num % 2 == 0:
        even_nums.append(list_num)
    else:
        odd_nums.append(list_num)

print(f"Число: {num}")
print(f"Чётные цифры: {even_nums}")
print(f"Нечётные цифры: {odd_nums}")
