package qxmk.mk;

import java.util.Scanner;

public class input {
    public static String input() {
        Scanner strin = new Scanner(System.in);
        String str = strin.next();
        if (str.equals("")) {
            str = "null";
        }
        return str;
    }
}
