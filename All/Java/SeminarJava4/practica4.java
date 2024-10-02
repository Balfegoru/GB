
// Задание 1. Удаление нечетных строк
// Дан LinkedList с несколькими элементами. В методе
// removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
// которых нечетная. Используйте LinkedList и стандартные методы.

// Задача 2. Реализация стека
// Реализуйте MyStack с использованием LinkedList с методами:
// ● push(String element) - добавляет элемент на вершину стека
// ● pop() - возвращает элемент с вершины и удаляет его
// ● peek() - возвращает элемент с вершины, не удаляя
// ● getElements() - возвращает все элементы стека

// Задача 3. Количество вхождений слова
// Реализуйте метод countOccurrences в классе ListUtils, который
// принимает LinkedList<String> и строку, и возвращает количество
// вхождений строки в список.

// Задача 4. Сдвиг очереди
// Реализуйте метод rotateDeque в классе DequeTasks, который принимает
// Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
// позиций. Если n отрицательное, повернуть влево

// Задача 5*. Удаление слова из очереди
// Реализуйте метод removeAllOccurrences в классе DequeTasks, который
// принимает Deque<String> и строку value. Метод должен удалить все
// вхождения строки value из очереди.

package All.Java.SeminarJava4;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Deque;

import All.Java.SeminarJava4.ArrayStack;
import All.Java.SeminarJava4.MyStack;
import java.lang.RuntimeException;
public class practica4 {

    public static void main(String[] args) {

        // String[] arrayToList = {"1234","12","123","123456","12345"};
        // LinkedList<String> listLL = generateList(arrayToList);
        // System.out.println(listLL);

        //Task1
        // System.out.println("Task1: " + removeOddLengthStrings(listLL));
        //Task2
        // MyStack stack = new MyStack();

        // stack.push("1");
        // stack.push("2");
        // stack.push("3");
        // stack.push("4");
        // stack.getElements();
        // stack.peek();
        // System.out.println(stack.pop());
        // stack.getElements();
        
        //Task3
        // LinkedList<String> list = new LinkedList<>();
        // list.add("apple");
        // list.add("banana");
        // list.add("apple");
        // list.add("pear");
        // list.add("banana");
        // list.add("apple");
        // System.out.println(countOccurrences("apple",list));

        //Task4
        

    }
    
    static public Deque<Integer> rotateDeque(Deque<Integer> dequeInt, int n){
        


        return dequeInt
    }

    static public int countOccurrences(String str, LinkedList<String> llarray){
        int count = 0;
        for (int i = 0; i < llarray.size(); i++) {
            
            if(llarray.get(i).equals(str)){
                count = count + 1;
            }
        }
        return count;   
    }
    static public LinkedList<String> generateList(String[] arrayToList){
        LinkedList<String> result = new LinkedList<>();
        for (int i = 0; i < arrayToList.length; i++) {
            result.add(arrayToList[i]);
        }
        return result;
    }

    static public LinkedList removeOddLengthStrings(LinkedList<String> listLL){
        LinkedList<String> result = new LinkedList<>();
        for (int i = 0; i < listLL.size(); i++) {
            if(listLL.get(i).length() % 2 == 0)
            {
                result.add(listLL.get(i));
            }
        }
        return result;
    }

}
