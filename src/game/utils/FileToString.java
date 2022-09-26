package src.game.utils;

import java.io.File;
import java.util.Scanner;

public class FileToString {
    public static String getString(String pathname) {
        String result = "";

        try {
            Scanner sc = new Scanner(new File(pathname));

            while (sc.hasNextLine()) {result += sc.nextLine();}
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        

        return result;
    }
}
