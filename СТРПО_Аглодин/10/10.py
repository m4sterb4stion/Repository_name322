import tkinter as tk
from tkinter import ttk, messagebox, filedialog

root = tk.Tk()
root.title("Аглодин Ярослав Алексеевич")
root.geometry("640x480")

notebook = tk.ttk.Notebook(root)
notebook.pack(fill="both", expand=True, padx=10, pady=10)

vkladka_1 = tk.Frame(notebook)
notebook.add(vkladka_1, text="Калькулятор")

tk.Label(vkladka_1, text="Число 1:").pack()
num1 = tk.Entry(vkladka_1)
num1.pack()

tk.Label(vkladka_1, text="Операция:").pack()
operation = tk.StringVar(value="+")
operations = ["+", "-", "*", "/"]
tk.OptionMenu(vkladka_1, operation, *operations).pack()

tk.Label(vkladka_1, text="Число 2:").pack()
num2 = tk.Entry(vkladka_1)
num2.pack()


def calculate():
    try:
        a = float(num1.get())
        b = float(num2.get())
        op = operation.get()

        if op == "+":
            result = a + b
        elif op == "-":
            result = a - b
        elif op == "*":
            result = a * b
        elif op == "/":
            if b == 0:
                messagebox.showerror("Ошибка", "На ноль делить нельзя!")
                return
            result = a / b

        if result.is_integer():
            result_text = int(result)
        else:
            result_text = result

        messagebox.showinfo("Результат", result_text)
    except ValueError:
        messagebox.showerror("Ошибка", "Введите числа корректно!")
    except:
        messagebox.showerror("Ошибка", "Что-то пошло не так!")


tk.Button(vkladka_1, text="Посчитать", command=calculate).pack(pady=10)

vkladka_2 = tk.Frame(notebook)
notebook.add(vkladka_2, text="Чекбоксы")

check_b_1 = tk.BooleanVar()
check_b_2 = tk.BooleanVar()
check_b_3 = tk.BooleanVar()

tk.Checkbutton(vkladka_2, text="Чек-бокс 1", variable=check_b_1).pack()
tk.Checkbutton(vkladka_2, text="Чек-бокс 2", variable=check_b_2).pack()
tk.Checkbutton(vkladka_2, text="Чек-бокс 3", variable=check_b_3).pack()


def show_choice():
    choice = []
    if check_b_1.get():
        choice.append("первый")
    if check_b_2.get():
        choice.append("второй")
    if check_b_3.get():
        choice.append("третий")

    if choice:
        messagebox.showinfo(
            "Выбор", f"Вы выбрали следующие чек-боксы: {', '.join(choice)}"
        )
    else:
        messagebox.showinfo("Выбор", "Вы ничего не выбрали")


tk.Button(vkladka_2, text="Показать выбор", command=show_choice).pack(pady=10)

vkladka_3 = tk.Frame(notebook)
notebook.add(vkladka_3, text="Работа с текстом")

text_frame = tk.Frame(vkladka_3)
text_frame.pack(pady=10)

scrollbar = tk.Scrollbar(text_frame)
scrollbar.pack(side=tk.RIGHT, fill=tk.Y)

text_box = tk.Text(text_frame, height=10, width=40, yscrollcommand=scrollbar.set)
text_box.pack(side=tk.LEFT)

scrollbar.config(command=text_box.yview)


def load_text():
    file_path = filedialog.askopenfilename(
        title="Выберите текстовый файл",
        filetypes=[("Текстовые файлы", "*.txt"), ("Все файлы", "*.*")],
    )

    if file_path:
        try:
            with open(file_path, "r", encoding="utf-8") as file:
                content = file.read()

            text_box.delete(1.0, tk.END)
            text_box.insert(1.0, content)

            file_name = file_path.split("/")[-1]
            messagebox.showinfo("Успех", f"Файл '{file_name}' загружен!")

        except Exception as e:
            messagebox.showerror("Ошибка", f"Не удалось загрузить файл:\n{str(e)}")


tk.Button(vkladka_3, text="Загрузить текст", command=load_text).pack()


def clear_text():
    text_box.delete(1.0, tk.END)
    messagebox.showinfo("Очистка", "Текст очищен!")


tk.Button(vkladka_3, text="Очистить", command=clear_text).pack(pady=5)

root.mainloop()
