# // Вася выложил своё новое приложение на платформу для начинающих разработчиков,
# // на ней пользователи могут ставить оценку приложению: от −100 до 100. Ему
# // захотелось сравнить количество положительных и отрицательных отзывов, для этого
# // он заранее отфильтровал все отзывы так, чтобы в конце были те, которые равны нулю.
# // Напишите программу, которая находит количество положительных и количество
# // отрицательных чисел в последовательности. Последовательность заканчивается на
# // числе 0.
a = 10
neg = 0
pos = 0
nul = 0
while a != 0:
    a = int(input("Введите число:"))
    if a > 0:
        pos+=1
    elif a < 0:
        neg+=1
    else:
        continue


print(f"Кол-во положительных чисел: {pos}") 
print(f"Кол-во отрицательных чисел: {neg}") 
