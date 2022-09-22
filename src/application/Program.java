package application;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        File file = new File("in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }  catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage() );
        }
        finally {
            if (Objects.nonNull(sc)) {
                sc.close();
            }
        }
    }
}
