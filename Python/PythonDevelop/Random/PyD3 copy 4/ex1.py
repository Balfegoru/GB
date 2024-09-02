# Задача №1. Общее обсуждение
# Дан список чисел. Определите, сколько в нем
# встречается различных чисел.
# Input: [1, 1, 2, 0, -1, 3, 4, 4]
# Output: 6


list1 = [3, 3, 3, 3, 3, 3, 3, 3]
a = None
count = 0
for i in range(len(list1)):
    if list1[i] != None:
        a = list1[i]
        count += 1

        for k in range(len(list1)):
            if list1[k] == a and list1[k] != None :
                list1[k] = None


print (count)

# for i in range(len(list2)):
#     for k in range(len(list1)):
#         print(f"k {k} -- {list2[i]}")
    