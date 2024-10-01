//0
//Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

// Задание №1
// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

// Задание №2.1
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

// Задание №3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

// Задание №4
// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
// что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры.

//Доп
// Пусть дан произвольный список целых чисел, удалить из него чётные числа

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое этого списка.

package All.Java.SeminarJava3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class seminar4 {

    public static void main(String[] args) {
        // String s1 = "hello";
        // String s2 = "hello";
        // String s3 = s1;
        // String s4 = "h" + "e" + "l" + "l" + "o";
        // String s5 = new String("hello");
        // String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        // ArrayList<Integer> arrayList = new ArrayList<>();

        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equals(s4));
        // System.out.println(s1.equals(s5));
        // System.out.println(s1.equals(s6));
        // System.out.println(s5.equals(s6));
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1==s4);
        // System.out.println(s1==s5);
        // System.out.println(s1==s6);
        // System.out.println(s5==s6);

        // Task1
        // System.out.println("Task1 : " + Task1());

        // Task2
        // System.out.println("Task2 : ");
        // Task2();
        // Task3
        // Task3();
        // Task4
        // String title = "Война и Мир";
        // String genre = "Роман";
        // ArrayList<ArrayList<String>> titleBaseArrayList = new ArrayList<>();
        // ArrayList<String> bookArrayList = new ArrayList<>();
        // String[] bookStrings = {genre,title};
        // Collections.addAll(bookArrayList,bookStrings);
        // System.out.println(bookArrayList);
        // titleBaseArrayList = Task4(bookArrayList, titleBaseArrayList);
        // System.out.println(titleBaseArrayList);
    }

    public static ArrayList<Integer> Task1() {

        ArrayList<Integer> integers = new ArrayList<>();
        int N = 10;
        for (int i = 0; i < N; i++) {
            integers.add((int) (Math.random() * 10));
        }
        Collections.sort(integers);
        return integers;
    }

    public static void Task2() {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList.add("Земля");
        arrayList.add("Меркурий");
        arrayList.add("Марс");
        arrayList.add("Венера");
        arrayList.add("Марс");
        arrayList.add("Уран");
        arrayList.add("Земля");
        arrayList.add("Земля");

        for (int i = 0; i < arrayList.size(); i++) {
            String planetName = "";
            int count = 0;
            boolean spot = true;
            for (int j = i; j < arrayList.size(); j++) {
                if (!arrayList1.contains(arrayList.get(i)) & spot) {
                    arrayList1.add(arrayList.get(i));
                    planetName = arrayList.get(i);
                    count += 1;
                    spot = false;
                } else if (arrayList.get(j) == planetName) {
                    count += 1;
                }
            }
            if (!spot) {
                System.out.println(planetName + " " + count);
            }
        }
        System.out.println(arrayList1);
    }

    public static void Task3() {

        ArrayList<String> ars = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        ars.add("1");
        ars.add("Panda");
        ars.add("Sparta");
        ars.add("23");
        ars.add("Spartanec");
        ars.add("7");

        for (String obgect : ars) {
            try {
                Integer.parseInt(obgect);
            } catch (Exception e) {
                result.add(obgect);
            }
        }
        System.out.println(result);
    }

    public static ArrayList<ArrayList<String>> Task4(ArrayList<String> book,
            ArrayList<ArrayList<String>> titleBaseArrayList) {
            titleBaseArrayList.add(book);
            return titleBaseArrayList;
    }


}
