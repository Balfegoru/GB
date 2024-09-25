// Задание 1. Нахождение факториала числа
// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.

// Задача 2. Вывод всех четных чисел от 1 до 100
// Напишите метод printEvenNums, который выведет на экран все четные числа
// в промежутке от 1 до 100, каждое на новой строке.

// Задача 3. Подсчет суммы цифр числа
// Напишите метод sumDigits, который принимает целое число n и возвращает
// сумму его цифр.

// Задача 4*. Нахождение максимального из трех чисел
// Реализуйте две функции:
// 1. Функция findMaxOfTwo должна принимать два числа и возвращать
// максимальное из них, используя только знак сравнения.
// 2. Функция findMaxOfThree должна принимать три числа и находить
// максимальное из них, используя первую функцию.


public class practika1 {
    public static void main(String[] args) {
        //task1
        //int n = 5;
        //System.out.println(factorial(n)); 

        //task2
        //printEvenNums(); 

        //task3
        //int number = 345;
        // System.out.println(sumDigits(number));

        //task4
        System.out.println(findMaxOfThree(5,6,7));
    }


    public static int findMaxOfTwo(int a,int b){
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static int findMaxOfThree(int a,int b,int c){
        int d = findMaxOfTwo(b,c);
        if(a > d)
        {
            return a;
        }
        else
        {
            return d;
        }
    }



    public static int sumDigits(int number){
        String srtNumbers = Integer.toString(number);
        char[] chars = srtNumbers.toCharArray();
        int sum = 0;
        for(int i = 0; i < chars.length;i++){
            sum += Integer.parseInt(String.valueOf(chars[i]));
            
        }
        return sum;
    }
    public static void printEvenNums(){
        for(int i = 0; i <= 100; i++){
            if(i%2 == 0)
            {
                System.out.println(i);
            } 
        }
    }

    public static int factorial(int n) {
        if(n < 0){
            return -1;
        }
        int factor = 1;

        if(n == 0)
        {
            return 0;
        }
        
        for(int i = 1; i <= n;i++)
        {
            factor *= i;
        }
        return factor;
    }
}
