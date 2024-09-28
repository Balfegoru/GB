// Задание №1
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.
// Задание №2
// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// Задание №3
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).
// Задание №4
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
// Задание №5
// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.
// Задание №6 (доп)
// Напишите метод, который определит тип (расширение) файлов из
// текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class seminar2 {
    public static void main(String[] args) {



        
        // String c1 = "c1";
        // String c2 = "c2";
        // //Task1(c1, c2);
        // String str = "aaaabbbcdd";
        // //Task2(str);
        // //Task3(str);

        // //Task4();
        // //Task5(); //File не работает

        // File file = new File(".");
        // File[] files = file.listFiles();
        // files[0].getName();

        // if(file.isFile()) return;
        // System.out.println(file.getAbsolutePath());

}
    public static void Task1(String c1,String c2) {
        StringBuilder sb = new StringBuilder();
        
        c1 = "c1";
        c2 = "c2";
        int N = 18;

        for (int i = 0; i < N; i++) {
            if(i%2 == 0)
            {
                sb.append(c1).toString();
            }
            else
            {
                sb.append(c2).toString();
            }
        }
        System.out.println(sb);
    }

    public static void Task2(String str) {
        
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(result.indexOf(str.charAt(i)) == -1){
                sb.append(str.charAt(i));
                result += sb.toString(); //область видимости
            }
        }
        result = sb.toString();
        System.out.println(result);
    }

    public static void Task3(String str){
        int co = str.length();

        if(co%2 == 0){
            String rightStr = str.substring(0,co/2);//правая сторона
            String leftStr = str.substring(co/2,co);//левая сторона
            StringBuilder sb = new StringBuilder();
            String reverseLeftStr = sb.append(leftStr).reverse().toString();


            if(rightStr.equals(reverseLeftStr)){
                System.out.println("Palindrome " + co + " numbers");
                return;
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
        else{
            String rightStr = str.substring(0,co/2);//правая сторона
            String leftStr = str.substring(co/2+1,co);//левая сторона
            StringBuilder sb = new StringBuilder();
            String reverseLeftStr = sb.append(leftStr).reverse().toString();

            if(co == 1){
                System.out.println("Palindrome " + co + " numbers");
                return;
            }
            else{
                if(rightStr.equals(reverseLeftStr)){
                    System.out.println("Palindrome " + co + " numbers");
                }
                else{
                    System.out.println("Not Palindrome");
                }
            }
        }
    }

    //TEST
    public static void Task4() {
        StringBuilder sb = new StringBuilder();
        int N = 100;
        for (int i = 0; i < N; i++) {
            sb.append("TEST");
        }
        System.out.println(sb);

        try (FileWriter writer = new FileWriter("TEST.txt")){
            writer.append(sb.toString());
            writer.close();
        }
        catch(IOException ex){
            System.out.println ("Error: " + ex.getMessage ());
        }
        finally {
            //System.out.println("Data save");
        }
    }

    public static void Task5(){
        
    }
}

