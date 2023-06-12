import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr1 = sc.next();
        String combingOut = sc.next();
        String nStr2 = sc.next();

        Map<String,Integer> dictionary = new HashMap<String,Integer>();
        dictionary.put("один",1);
        dictionary.put("два",2);
        dictionary.put("три",3);
        dictionary.put("четыре",4);
        dictionary.put("пять",5);
        dictionary.put("шесть",6);
        dictionary.put("семь",7);
        dictionary.put("восемь",8);
        dictionary.put("девять",9);

        Map<Integer,String> dictComb = new HashMap<Integer,String>();
        dictComb.put(1,"один");
        dictComb.put(2,"два");
        dictComb.put(3,"три");
        dictComb.put(4,"четыре");
        dictComb.put(5,"пять");
        dictComb.put(6,"шесть");
        dictComb.put(7,"семь");
        dictComb.put(8,"восемь");
        dictComb.put(9,"девять");

        if(Objects.equals(combingOut, "минус")) {
            int result = dictionary.get(nStr1) - dictionary.get(nStr2);
            System.out.println(dictComb.get(result));
        }
        else if(Objects.equals(combingOut, "плюс")) {
            int result = dictionary.get(nStr1) + dictionary.get(nStr2);
            System.out.println(dictComb.get(result));
        } else {
            int result = dictionary.get(nStr1) * dictionary.get(nStr2);
            System.out.println(dictComb.get(result));
        }
    }
}
