//         Задание 1. Формирование URL с параметрами
// Дана строка базового URL:
// https://example.com/search?
// Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
// передаются в виде строки, где ключи и значения разделены =, а пары
// ключ-значение разделены &. Если значение null, то параметр не должен
// попадать в URL.
// Пример:
// params = "query=java&sort=desc&filter=null"
// Результат:
// https://example.com/search?query=java&sort=desc

// Задача 2. Создание CSV-строки из массива объектов
// Дан массив объектов, где каждый объект представляет собой строку данных, и
// массив заголовков. Создайте строку CSV, где строки данных разделяются новой
// строкой, а значения в строках разделяются запятыми.
// Пример:
// String[] headers = {"Name", "Age", "City"};
// String[][] data = {
// {"John", "30", "New York"},
// {"Alice", "25", "Los Angeles"},
// {"Bob", "35", "Chicago"}
// };
// Результат:
// Name,Age,City
// John,30,New York
// Alice,25,Los Angeles
// Bob,35,Chicago

// Задача 3. Удаление пустых строк из текста
// Дана строка с несколькими строками текста, разделенными переводами строки.
// Напишите метод, который удаляет все пустые строки из текста.
// Пример:
// line1
//
// line2
//
//
// line3
// Результат:
// line1
// line2
// line3
// class TextCleane

// Задача 4. Логирование операций с массивом во время поиска
// минимального и максимального элементов
// Реализуйте метод поиска минимального и максимального элементов массива.
// После нахождения каждого элемента (минимального и максимального),
// сделайте запись в лог-файл log.txt в формате год-месяц-день
// час:минуты {минимальный элемент}, {максимальный элемент}.

// import java.util.Dictionary;
// import java.util.Hashtable;
import java.io.*;

public class practika2 {

    public static void main(String[] args) {

        // //Task1
        // String params = "query=java&sort=desc&filter=null";
        // String resultUrl = "https://example.com/search?";
        // String res = task1(params,resultUrl);
        // System.out.println(res);

        // //Task2
        // String[] headers = {"Name", "Age", "City"};
        // String[][] data = {
        // {"John", "30", "New York"},
        // {"Alice", "25", "Los Angeles"},
        // {"Bob", "35", "Chicago"}
        // };
        // task2(headers,data);

        //Task3
        //task3("Task3.txt");

        //Task4
        //task4();

    }

    public static String task1(String params, String resultUrl) {
                String[] param1 = params.split("&");
            
                    for(int i = 0; i < param1.length; i++){
                        //System.out.println(param1[i]);
                        if(param1[i].contains("null")){
                            continue;
                        }
                        resultUrl = resultUrl.concat(param1[i] + "&"); 
                    }
                resultUrl = resultUrl.substring(0,resultUrl.length()-1);
                
                return resultUrl;
        }
    //task2
        ////////
    public static void task2(String[] headers,String[][] data) {
            
            try (FileWriter writer = new FileWriter("UrlFileCSV.txt")){
                for (int i = 0; i < headers.length; i++) {
                    if(i != headers.length-1){
                        writer.append(headers[i] + ",");
                    }
                    else
                    {
                        writer.append(headers[i] + "\n");
                    }
                }

                for (int i = 0; i < data.length; i++) {
                    for (int j = 0; j < data.length; j++) {
                        if(j != headers.length-1){
                            writer.append(data[i][j] + ",");
                        }
                        else
                        {
                            writer.append(data[i][j] + "\n");
                        }
                    }
                }
                writer.close();
            }
            catch(IOException ex){
                System.out.println ("Error: " + ex.getMessage ());
            }
            finally {
                //System.out.println("Data save");
            }       
        }

    public static void task3(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String text;
            StringBuilder result = new StringBuilder();
            
            while((text = br.readLine()) != null) {
                    result.append(text);
                    result.append("%");
            }
            result.length();
            
            int a = 0; //счетчик
            for (int i = 0; i < result.length(); i++) {
                if(result.charAt(i) == '%' & a == 0){
                    result.setCharAt(i,'\n');
                    a++;
                }
                else{
                    if(result.charAt(i) == '%'){
                        result.deleteCharAt(i);
                        i--;
                    }
                    else
                    {
                        a = 0;
                    }
                }
            }

            try(FileWriter writer = new FileWriter("Task3.txt")){
                writer.append(result);
    
            }
            catch(IOException ex){
                System.out.println ("Error: " + ex.getMessage ());
            }
            finally{
                System.out.println("File rebuild");
            }

            //System.out.println(result);
        }
        catch(IOException ex){
            System.out.println ("Error: " + ex.getMessage ());
        }
        finally {
            System.out.println("Text rebuild");
        }
        
        
    }
}