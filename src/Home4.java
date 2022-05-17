import java.util.Random;
import java.util.Scanner;

public class Home4 {
    public static void main (String [] arqs) {
        Random q = new Random();
        System.out.println("Enter number 5<n<=10");
        int n;
        while (true) {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            if (n > 5 && n <= 10)
                break;
            else System.out.println("Enter number 5<n<=10");
        }
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = q.nextInt();
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int nums1[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            int a = nums[i] % 2;
            if (a == 0) {
                nums1[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++)
            System.out.print(nums[i] + " ");
    }
}
