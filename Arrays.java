import java.util.Scanner;
import java.util.Arrays;
class A {
    public static void main(String[] args) {
        //int a[]={34,56,87,97,98,86};
        int a[] = new int[5];
        System.out.println("Enter array elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        
System.out.println("Elements are ");
        for(int b : a)
        {
  System.out.println(b+ " ");
        }

        
    }
}