# Задача 3: Требуется вывести все целые степени двойки (т.е. числа
# вида 2k
# ), не превосходящие числа N.

# 10 -> 1 2 4 8


N = 90
a = 1
while a < N:
    print(a,end = " ")
    a*=2