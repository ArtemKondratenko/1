import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        String line = "I have 3 cats, 4 ljgs, and 1 turtle";
        char[] arr = line.toCharArray();
        int n = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (char s: arr) {
           n = s;
           if((48 <= n && n < 58)){
               int number = Character.digit(s,10);
              al.add(number);
           }
        }
        System.out.println(al);
        }
}
