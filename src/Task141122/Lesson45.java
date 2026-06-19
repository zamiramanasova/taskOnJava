package Task141122;

import java.io.File;

/**
 * 45. Напишите программу на Java, чтобы найти размер указанного файла.
 */
public class Lesson45 {
    public static void main(String[] args) {
        File file = new File("/Users/Asus/OneDrive/Desktop/english.txt");
        if (file.exists()) {
            getFileSizeBytes(file);
        } else {
            System.out.println("Not found");
        }

    }
    private static String getFileSizeBytes(File file) {
        return file.length() + " bytes";
    }
}
