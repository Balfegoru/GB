# Задача 1: Найдите сумму цифр трехзначного числа. 

# 123 -> 6 (1 + 2 + 3)
# 100 -> 1 (1 + 0 + 0)

num = 253

result = num % 10 + num // 100 + num % 100 // 10 

print(f"{result}")