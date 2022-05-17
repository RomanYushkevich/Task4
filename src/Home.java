import java.util.Random;
import java.util.Scanner;

public class Home {
    public static void main (String [] arqs) {
        Random r = new Random();
        int nums[] = new int[15];
        for (int i = 0; i < 15; i++)
            nums[i] = r.nextInt(15);
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < 15; i++)
            if (a == nums[i]) {
                System.out.println("Yes");
                break;
            }
    }
}
