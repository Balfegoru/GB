// Задание 1. Удаление отрицательных значений из массива
// Реализуйте метод, который принимает на вход целочисленный массив и
// удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
// только неотрицательные числа.
// Пример:
// [-1, 2, -3, 4, -5, 6]
// Результат:
// [2, 4, 6]

// Задача 2. Уникальные числа
// Напишите метод, который принимает целочисленный массив и возвращает
// новый массив, содержащий только уникальные элементы из исходного
// массива.
// Пример:
// [1, 2, 2, 3, 4, 4, 5]
// Результат:
// [1, 2, 3, 4, 5]

// Задача 3. Длина слов
// Реализуйте метод, который принимает на вход массив строк и возвращает
// новый массив, содержащий только строки, длина которых больше 3 символов.
// Пример:
// ["cat", "elephant", "dog", "giraffe"]
// Результат:
// ["elephant", "giraffe"]

// Задача 4*. Среднее значение массива
// Напишите метод, который принимает массив целых чисел и возвращает
// среднее значение элементов массива, округленное до ближайшего целого
// числа.
// Пример:
// [4, 2, 7, 5, 1]
// Результат:
// 4

package All.Java.SeminarJava3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.lang.instrument.Instrumentation;
import java.lang.Math;

public class practica3 {

    public static void main(String[] args) {
        // Task1
        int[] a = new int[] { -1, 2, -3, 4, -5, 6, 6, 2, -5 };
        String itresume_res = Arrays.toString(FilterNegative(a));
        System.out.println("Task1 : " + itresume_res);
        // Task2
        String unique = Arrays.toString(Task2(a));
        System.out.print("Task2 : ");
        System.out.println(unique);
        // Task3
        String[] animalsArray = new String[] { "cat", "elephant", "dog", "giraffe" };
        //filterShortStrings(animalsArray);
        String animalS = Arrays.toString(filterShortStrings(animalsArray));
        System.out.println("Task3 : " + animalS);

        //Task4
        int[] arif = new int[] {4, 2, 7, 5, 1};
        System.out.println("Task3 : " + Task4(arif));
    }
    //Task1
    public static int[] FilterNegative(int[] a) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                al.add(a[i]);
            }
        }
        int[] temp = new int[al.size()];
        // System.out.println(al.get(0).getClass());
        for (int i = 0; i < al.size(); i++) {
            temp[i] = al.get(i);
        }
        return temp;
    }

    // Task2
    public static int[] Task2(int[] array) {
        Set<Integer> set1 = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            set1.add(array[i]);
        }
        // System.out.println(set1);
        int[] temp = new int[set1.size()];

        ArrayList<Integer> arrayList = new ArrayList<>(set1);

        for (int i = 0; i < arrayList.size(); i++) {
            temp[i] = arrayList.get(i);
        }

        return temp;
    }

    // Task3
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > 3){
                arrayList.add(arr[i]);
            }
        }

        String[] temp = new String[arrayList.size()];
        
        for (int i = 0; i < arrayList.size(); i++) {
            temp[i] = arrayList.get(i);
        }
        return temp;
    }

    //Task4
    public static int Task4(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        int result = (int)Math.ceil((double)sum/(double)array.length);
        
        //System.out.printf("%.0f",result);
        return result;
    }



}
