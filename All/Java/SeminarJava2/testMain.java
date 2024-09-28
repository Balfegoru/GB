

import java.nio.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;



public class testMain {
    public static void main(String[] args) {

        File path = new File("testMain.java");
        // Укажите путь к вашему локальному файлу

        // Получаем объект Path
        Path paths = Paths.get(path.getAbsolutePath());

        // Если необходимо, преобразуем Path в File
        File file = paths.toFile();

        // Теперь вы можете использовать объект File
        if (file.exists()) {
            System.out.println("Файл существует: " + file.getAbsolutePath());
        } else {
            System.out.println("Файл не найден.");
        }
    }
}
