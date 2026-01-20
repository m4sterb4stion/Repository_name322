# Задание 6, вариант 7
numbers = list(map(int, input("Введите числа через пробел: ").split()))

if len(numbers) < 2:
    print("Массив должен содержать минимум 2 элемента!")
else:
    min_index = numbers.index(min(numbers))
    max_index = numbers.index(max(numbers))
    numbers[min_index], numbers[max_index] = numbers[max_index], numbers[min_index]

    print(f"Массив после перестановки: {numbers}")
