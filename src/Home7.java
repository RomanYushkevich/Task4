import java.util.Random;
import java.util.Scanner;

public class Home7 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Random r = new Random();
        int nums[] = new int[a];
        for (int i = 0; i < a; i++) {
            nums[i] = r.nextInt();
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int s = 0, k;
        while (true) {
            for (int i = 0; i < a - 1; i++) {
                k = nums[i + 1];
                s = 0;
                if (nums[i] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                    nums[i] = k;
                    s++;
                }
            }
            if (s == 0)
                break;
        }
        for (int i = 0; i < a; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}
