import os

os.chdir(os.path.dirname(os.path.abspath(__file__)))

print("Файлы, доступные в текущей папке:")
for f in sorted(os.listdir(".")):
    if os.path.isfile(f):
        print(f"- {f}")

input_file_1 = input("Первый файл (выберите из списка выше): ")
input_file_2 = input("Второй файл (выберите из списка выше): ")
output_file = input("Выберите файл для записи: ")

text = open(input_file_1).read() + "\n" + open(input_file_2).read()
open(output_file, "w").write(text)

print(f"Готово! Данные записаны в файл '{output_file}'")
