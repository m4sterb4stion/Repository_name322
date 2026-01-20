# Задание 5, вариант 7
string = input("Введите строку: ")
string_lenght = len(string)
string_half = string_lenght // 2
new_string = ""

for i in range(string_lenght):
    if i < string_half and string[i].lower() == "п":
        new_string += "*"
    else:
        new_string += string[i]

print(new_string)
