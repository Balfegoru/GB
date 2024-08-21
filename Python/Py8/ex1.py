# Введите ваше решение ниже

a = 3
b = 5

def f(a,b):
    if(b <= 1):
        return  a
    
    return f(a,b-1) * a

print(f(a,b))