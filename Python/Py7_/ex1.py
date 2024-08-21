
# Аргументы num_rows и num_columns указывают число строк и столбцов таблицы, которые должны быть распечатаны.

# Нумерация строк и столбцов идет с единицы (подумайте, почему не с нуля).

# Если строк меньше двух, выдайте текст
# ОШИБКА! Размерности таблицы должны быть больше 2!.

# Примечание: бинарной операцией называется любая операция, у которой ровно два аргумента, как, например, у операции умножения.

# Между элементами должен быть 1 пробел, в конце строки пробел не нужен.

# Пример

# На входе:



# На выходе:


# 1 2 3
# 2 4 6 
# 3 6 9

def print_operation_table(func,num_rows=9,num_columns=9):

    if num_rows < 2 or num_columns < 2:
        print('ОШИБКА! Размерности таблицы должны быть больше 2!')

    else:    
        for i in range(num_rows):

            for k in range(num_columns):
                if k == 0 and i == 0:
                    print(1, end=' ')
                elif k < num_columns - 1:
                    print(func(i+1,k+1),end=' ')
                else:
                    print(func(i+1,k+1))  
        


print_operation_table(lambda x, y: x * y, 3, 3)
print("\n")
print_operation_table(lambda x, y: x + y, 4, 4)
print("\n")
print_operation_table(lambda x, y: x - y, 5, 5)
print("\n")
print_operation_table(lambda x, y: x * y, 1, 2)
print("\n")
print_operation_table(lambda x, y: x / y, 4, 4)
print("\n")
print_operation_table(lambda x, y: x * y)