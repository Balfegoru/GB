# Допзадачи от меня:

# Допзадание 1 - Пользователь вводит любое число (дробное или целое), надо посчитать количество цифр в числе. Решаем строго математически, обращаться к числу как к строке нельзя.

# 0 -> 1
# 9 -> 1
# 56.77 -> 4
# -0.0001 - > 5
# 100.18006 ->8

# Допзадание 2

# Валентина прогуляла лекцию по математике.
# Преподаватель решил подшутить над нерадивой студенткой и
# попросил ее на практическом занятии перечислить все положительные делители некоторых целых чисел.
# Для несложных примеров студентка быстро нашла решения (для числа 6 это: 1, 2, 3, 6; а для числа 16 это: 1, 2, 4, 8, 16), но этим все не закончилось.
# На домашнее задание ей дали варианты посложнее: 23436, 190187200, 380457890232.
# •
# Решить такое вручную, как вы понимаете, практически нереально.
# Вот Валентина и обратилась к вам за помощью.
# Помогите ей.
# Постарайтесь найти самое оптимальное решение.
# Результат представьте в виде списка (не забудьте отсортировать по возрастанию).

list1 = []
N = 23436
a = 1

while a <= N:
    if N % a == 0:
        # print(a, end = " ")
        list1.append(a)
    a +=1
    
print(f"\n{list1}")
