import java.util.Random;
import java.util.Scanner;

public class Home1 {
    public static void main (String [] arqs) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Random r = new Random();
        int nums[] = new int[20];
        for (int i = 0; i < 20; i++) {
            nums[i] = r.nextInt();
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int nums1[] = new int[20];
        int j =0;
        for (int i = 0;i<20;i++)
            if (nums[i] !=a){
                nums1[j]=nums[i];
                j++;
            }
        for (int i=0;i<j;i++)
            System.out.print(nums[i]+" ");
    }
}
