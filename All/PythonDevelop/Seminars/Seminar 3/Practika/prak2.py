# Задача 2. Кино
# Илья зашёл на любительский киносайт, на котором пользователи оставляют
# рецензии на фильмы. Их список:
# films = [‘Крепкий орешек’, ‘Назад в будущее’, ‘Таксист’, ‘Леон’, ‘Богемская
# рапсодия’, ‘Город грехов’, ‘Мементо’, ‘Отступники’, ‘Деревня’]
# Илья на сайте в первый раз. Он хочет зарегистрироваться и сразу добавить
# часть фильмов в список любимых, чтобы позже прочитать рецензии на них.
# Напишите программу, в которой пользователь вводит фильм. Если кинокартина
# есть в перечне, то добавляется в список любимых. Если её нет, то выводится
# ошибка. В конце выведите весь список любимых фильмов.
# Пример:
# Сколько фильмов хотите добавить? 3
# Введите название фильма: Леон
# Введите название фильма: Безумный Макс
# Ошибка: фильма Безумный Макс у нас нет :(
# Введите название фильма: Мементо
# Ваш список любимых фильмов: Леон, Мементо
result = []
films = ["Крепкий орешек", "Назад в будущее", "Таксист", "Леон", 
        "Богемская рапсодия", "Город грехов", "Мементо", "Отступники", "Деревня"]
numberFilms = int(input("Сколько фильмов вы хотите добавить?"))
count = 0
while count < numberFilms:
    a = input("Введите название фильма:")
    if  a in films:
        result.append(a)
        count+=1
    else:
        print(f"Ошибка: фильма {a} у нас нет :(")

print(f"Ваш список любимых фильмов:{result}")
