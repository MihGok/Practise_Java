package Practise_Java.Practice21;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DirOut {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\root\\Desktop\\анализ данных\\данные\\данные"); //path указывает на директорию
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        for (int i = 0; i < 5; i++) {
            System.out.println(lst.get(i));
        }
    }
}
