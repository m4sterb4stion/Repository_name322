# Задание 7_1, вариант 7
import math


def triangle_area_two_sides(a, b):
    return (a * b) / 2


def triangle_area_three_sides(a, b, c):
    p = (a + b + c) / 2
    if p <= max(a, b, c) or p <= 0:
        return 0
    return math.sqrt(p * (p - a) * (p - b) * (p - c))


def quadrilateral_area(X, Y, Z, T):
    area1 = triangle_area_two_sides(X, Y)
    hypotenuse = math.sqrt(X**2 + Y**2)
    area2 = triangle_area_three_sides(hypotenuse, Z, T)
    total_area = area1 + area2

    return total_area


def main():
    try:
        X = float(input("Введите длину стороны X: "))
        Y = float(input("Введите длину стороны Y: "))
        Z = float(input("Введите длину стороны Z: "))
        T = float(input("Введите длину стороны T: "))

        if X <= 0 or Y <= 0 or Z <= 0 or T <= 0:
            print("Все стороны четырехугольника должны быть положительными числами!")
            return

        area = quadrilateral_area(X, Y, Z, T)

        if area == 0:
            print("Такой четырёхугольник не существует!")
        else:
            print(f"Площадь четырёхугольника: {area}")

    except ValueError:
        print("Ошибка: введите числа!")


if __name__ == "__main__":
    main()
