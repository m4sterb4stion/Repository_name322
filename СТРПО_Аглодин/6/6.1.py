# Задание 6, вариант 7
numbers = list(map(int, input("Введите числа через пробел: ").split()))
sum = 0
product = 1

for i in range(len(numbers)):
    if i % 2 == 0:
        sum += numbers[i]
    else:
        product *= numbers[i]

print(f"Сумма четных элементов массива: {sum}")
print(f"Произведение нечетных элементов массива: {product}")
