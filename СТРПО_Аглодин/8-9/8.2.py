# Задание 8_2, вариант 7 
n = int(input("Размер матрицы: "))
matrix = [
    list(map(float, input("Введите матрицу построчно: ").split())) for _ in range(n)
]
trace = sum(matrix[i][i] for i in range(n))

print(f"\nСлед: {trace}")
for i in range(n):
    if i % 2 == 1:
        for j in range(n):
            matrix[i][j] /= trace
    print(" ".join(f"{x:.4f}" for x in matrix[i]))
