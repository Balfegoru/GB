// Задание №1
// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”


// Задание №1+
// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
import java.util.Scanner;

public class presa {
    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        //task4();
    }

    public static void task4(){

        String str = "Добро пожаловать на курс по Java";
        String[] result = str.split(" ");
        System.out.println(str);

        for(int i = result.length - 1; i >= 0;i--){
            System.out.printf("%s ",result[i]);
        }
    }
    public static void task3(){
        int[] nums = new int[] {3,2,2,3};
        int val = 3;

        int a = 0;
        //int b = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == val){
                for(int k = i;k < nums.length-1;k++)
                {
                    if(nums[k+1] != i){
                        a = nums[k];
                        nums[k] = nums[k + 1];
                        nums[k + 1] = a;
                    }
                }
            }
        }

        for (int i : nums) {
            System.out.print(i);
        }
    } 
    public static void task2() {
        int[] mass1 = new int[] {1,1,0,1,1,1};
        int max = 0;
        int buff = 0;

        for(int i = 0; i < mass1.length; i++){
            if(mass1[i] == 1 & i != mass1.length - 1){
                buff+=1;
            }
            else{
                if(i == mass1.length-1){
                    buff+=1; 
                }
                max = buff;
                buff = 0;
            }
        }
        System.out.println(max);

    }
    public static void task1(){
        java.time.LocalTime currentDateTime = java.time.LocalTime.now();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insert name: ");
        String name = sc.next();
        int time = (int)currentDateTime.getHour();

        if (time >= 5 & time < 12){
            System.out.printf("Доброе утро, %s",name);
        }
        if (time >= 12 & time < 18){
            System.out.printf("Добрый день, %s",name);
        }
        if (time >= 18 & time < 22){
            System.out.printf("Добрый вечер, %s",name);
        }
        if (time >= 22 & time < 5){
            System.out.printf("Доброй ночи, %s",name);
        }
        sc.close();
    }
}

