import java.util.Random;
import java.util.Scanner;

public class Home3 {
    public static void main (String [] arqs) {
        int a1 = 0;
        int a2 = 0;
        Random r = new Random();
        int nums1[] = new int[5];
        for (int i = 0; i < 5; i++) {
            nums1[i] = r.nextInt();
            System.out.print(nums1[i] + " ");
            a1=a1+nums1[i];
        }
        System.out.println();
        int nums2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            nums2[i] = r.nextInt();
            System.out.print(nums2[i] + " ");
            a2=a2+nums2[i];
        }
        System.out.println();
        a1=a1/5;
        a2=a2/5;
        if (a1>a2)
            System.out.println("S1>S2");
        else if (a1<a2)
            System.out.println("S1<S2");
            else System.out.println("S1=S2");

    }
}
