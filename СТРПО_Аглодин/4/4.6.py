num = int(input("Введите число: "))

if num <= 0:
    print("Число должно быть больше 0!")
else:
    factor = 1
    for i in range(2, num + 1):
        factor *= i
    print(f"{num}! = {factor}")
