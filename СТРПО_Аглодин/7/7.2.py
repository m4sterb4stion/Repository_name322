# Задание 7_2, вариант 7
def converter_numbers(number):
    if number < 0:
        raise ValueError("Число должно быть неотрицательным!")

    octal_str = oct(number)[2:]
    result = octal_str.zfill(10)
    return result


def main():
    try:
        number = int(input("Введите неотрицательное целое число: "))
        if number < 0:
            print("Ошибка: число должно быть неотрицательным!")
            return

        result = converter_numbers(number)

        print(f"10-значный восьмеричный код числа {number}: {result}")

    except ValueError:
        print("Ошибка: пожалуйста, введите целое число!")


if __name__ == "__main__":
    main()
