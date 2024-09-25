# Задача №1. Решение в группах
# Напишите программу, которая принимает на вход
# строку, и отслеживает, сколько раз каждый символ
# уже встречался. Количество повторов добавляется к
# символам с помощью постфикса формата _n.
# Input: a a a b c a a d c d d
# Output: a a_1 a_2 b c a_3 a_4 d c_1 d_1 d_2
# Для решения данной задачи используйте функцию
# .split()

list1 = ["a","a","a","b","c","a","a","d","c","d","d"]
list2 = []
result = []


for i in range(len(list1)):
    if list1[i] in list2:
        continue
    else:
        list2.append(i)
        count=1
        for k in range(len(list1)):
            if list1[k] == list1[i] and i != k:
                list1[k] = list1[k] + "_" + str(count)
                count+=1
print(list1)

                