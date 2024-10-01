// Реализуйте MyStack с использованием LinkedList с методами:
// ● push(String element) - добавляет элемент на вершину стека
// ● pop() - возвращает элемент с вершины и удаляет его
// ● peek() - возвращает элемент с вершины, не удаляя
// ● getElements() - возвращает все элементы стека


package All.Java.SeminarJava4;
import java.util.*;

public class MyStack {

    private int size = 0;
    private int top = -1;
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element){
        stack.addFirst(element);
    }

    public String pop(){
        //stack.removeFirst();
        String value = stack.getFirst();
        stack.removeFirst();
        return value;
    }

    public void peek(){
        stack.peekFirst();
    }

    public void getElements(){
        System.out.println(stack);
        
    }
}
