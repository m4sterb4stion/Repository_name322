a = float(input("Введите сторону треугольника a: "))
b = float(input("Введите сторону треугольника b: "))
c = float(input("Введите сторону треугольника c: "))

if a + b > c and a + c > b and b + c > a and a > 0 and b > 0 and c > 0:
    p = (a + b + c) / 2
    area = (p * (p - a) * (p - b) * (p - c)) ** 0.5
    print(f"Площадь треугольника: {round(area, 3)}")
else:
    print("Треугольник не существует")
