import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayWeek {
    public static void main(String[] args) {
        Map<Integer,String> dictionary = new HashMap<Integer,String>();
        dictionary.put(1, "понедельник");
        dictionary.put(2, "вторник");
        dictionary.put(3, "среда");
        dictionary.put(4, "четверг");
        dictionary.put(5, "пятница");
        dictionary.put(6, "суббота");
        dictionary.put(7, "воскресенье");

        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        if(number <= 7) {
            System.out.println(dictionary.get(number));
        }else if(number > 7 && number <= 14) {
            System.out.println(dictionary.get(number-7));
        }else if (number > 14 && number <= 21) {
            Integer result  = (number - 7) - 7;
            System.out.println(dictionary.get(result));
        }else if (number > 21 && number <= 28) {
            Integer result = ((number -7) -7) - 7;
            System.out.println(dictionary.get(result));
        }
    }
}
