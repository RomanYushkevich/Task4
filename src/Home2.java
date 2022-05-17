import java.util.Random;
import java.util.Scanner;

public class Home2 {
    public static void main (String [] arqs) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Random r = new Random();
        int nums[] = new int[a];
        for (int i = 0; i < a; i++)
            nums[i] = r.nextInt();
        int amax = nums[0];
        int amin = nums[0];
        int as = 0;
        for (int i = 1; i < a; i++) {
                if (amin < nums[i])
                    amin = nums[i];
                if (amax>nums[i])
                    amax = nums[i];
                as = as + nums[i];
            }
        as=as/a;
        System.out.println("Max="+amax+" Min="+amin+" S="+as);
    }
}
