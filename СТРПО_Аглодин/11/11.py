# Задание 11, вариант 7 

import tkinter as tk
import requests
import json
import os

window = tk.Tk()
window.title("Задание 11 Вариант 7")
window.geometry("400x300")

label = tk.Label(window, text="Вставьте ссылку на репозиторий GitHub:")
label.pack(pady=10)

entry = tk.Entry(window, width=40)
entry.pack(pady=5)


def allow_paste(event):
    return True


entry.bind("<Control-v>", allow_paste)


def get_info():
    text = entry.get().strip()

    if not text:
        result_label.config(text="Вставьте ссылку!")
        return

    username = text

    if "github.com/" in text:
        parts = text.split("github.com/")
        if len(parts) > 1:
            username = parts[1].split("/")[0]
    elif "api.github.com/users/" in text:
        parts = text.split("api.github.com/users/")
        if len(parts) > 1:
            username = parts[1].split("/")[0]

    username = username.strip("/")

    try:
        url = f"https://api.github.com/users/{username}"
        response = requests.get(url, timeout=5)

        if response.status_code == 200:
            data = response.json()

            result = {
                "company": data.get("company"),
                "created_at": data.get("created_at"),
                "email": data.get("email"),
                "id": data.get("id"),
                "name": data.get("name"),
                "url": data.get("url"),
            }

            script_dir = os.path.dirname(os.path.abspath(__file__))

            filename = os.path.join(script_dir, f"{username}_info.json")

            with open(filename, "w", encoding="utf-8") as f:
                json.dump(result, f, indent=2, ensure_ascii=False)

            file_basename = os.path.basename(filename)
            result_label.config(text=f"✓ Сохранено в {file_basename}")

            print("\n" + "=" * 40)
            print(f"Данные для {username}:")
            print(f"Файл: {filename}")
            print("=" * 40)
            for key, value in result.items():
                print(f"{key:15} : {value}")

        elif response.status_code == 404:
            result_label.config(text="✗ Пользователь не найден!")
        else:
            result_label.config(text=f"✗ Ошибка {response.status_code}")

    except requests.exceptions.Timeout:
        result_label.config(text="✗ Таймаут. Проверь интернет")
    except:
        result_label.config(text="✗ Ошибка подключения!")


button = tk.Button(window, text="Получить данные", command=get_info)
button.pack(pady=10)

result_label = tk.Label(window, text="")
result_label.pack(pady=10)

window.mainloop()
