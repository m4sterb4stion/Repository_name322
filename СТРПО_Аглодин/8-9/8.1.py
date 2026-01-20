# Задание 8_1, вариант 7 
matrix_elements = list(
    map(int, input("Введите элементы матрицы через пробел: ").split())
)

n = int((-1 + (1 + 8 * len(matrix_elements)) ** 0.5) / 2)
mat = [[0] * n for _ in range(n)]

k = 0
for i in range(n):
    for j in range(i, n):
        mat[i][j] = matrix_elements[k]
        mat[j][i] = matrix_elements[k]
        k += 1

for i in range(n):
    print(*mat[i])
