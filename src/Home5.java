public class Home5 {
    public  static void main(String[] arqs){
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<10;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
        int j;
        for (int i=0;i<10;i++){
            j=i%2;
            if (j!=0)
                nums[i]=0;
        }
        for (int i=0;i<10;i++)
            System.out.print(nums[i]+" ");
        System.out.println();

    }
}
