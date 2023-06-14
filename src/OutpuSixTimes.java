import java.util.Scanner;

public class OutpuSixTimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (int i = 0; i < 6; i++) {
            System.out.println(line);
        }

    }
}
