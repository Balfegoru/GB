


# a = None
# list_card = [1,2,3,4,5,1,5]
# while a == 0:
#     a = int(input("Видеокарта 1: "))
    
#     list_card.append(a)

# max = max(list_card)
# for i in list_card:
#     if i == max:
#         list_card.remove(i)


# print(list_card)

films = ["Крепкий орешек", "Назад в будущее", "Таксист", "Леон", "Богемская рапсодия",
"Город грехов", "Мементо", "Отступники", "Деревня"]


list_ilia = []
a = 0
while a < 3:
    film = input("введите название фильма:")

    if film not in films:
        print("Такого фильма нет, давай другой или 0 жми:")
    else:
        list_ilia.append(film)
    a+=1


print(list_ilia)