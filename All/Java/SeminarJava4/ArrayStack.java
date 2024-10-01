// Задача 2. Реализация стека
// Реализуйте MyStack с использованием LinkedList с методами:
// ● push(String element) - добавляет элемент на вершину стека
// ● pop() - возвращает элемент с вершины и удаляет его
// ● peek() - возвращает элемент с вершины, не удаляя
// ● getElements() - возвращает все элементы стека



package All.Java.SeminarJava4;
import java.lang.Exception;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;


public class ArrayStack {
    private int size = 0;
    private int capacity = 2;
    private int top = -1;
    private int[] stack = new int[capacity];

    private void addCapacity() {
        capacity = capacity * 2;
        int [] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size);
        // 1 откуда, 2 с какой позиции скопируем, 3 куда копируем,4 с какой позиции вставляем
        //5 сколько встаивть
        stack = newStack; //на этом моменте сборщик мусора(GarbageCollector) сам ужадть старый массив

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void push(int value){
        if(isFull()){
            addCapacity();
        }
        stack[++top] = value;
        size++;

    }

    private boolean isFull(){
        return size == capacity;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        } 
        return stack[top];
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        size--;
        capacity = capacity - 1;
        return stack[top--];
    }
}