
from logger import input_data, print_data



def interface():
    print("Добрый день! Вы попалли на специальный бот справочник от Георгия \n1-запись данных\n2-вывод данных")
    command = int(input('Введите число'))

    while command !=1 and command !=2:
        print('Неправильный ввод')
        command = int(input('Введите число: '))

    if command == 1:
        input_data()
    elif command == 2:
        print_data()

