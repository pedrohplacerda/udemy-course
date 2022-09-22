package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enteder a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");

        assert folders != null;
        for (File folder : folders) {
            System.out.println(folder);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println(success);


    }
}
