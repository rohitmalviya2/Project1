import java.util.Scanner;
class A {
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        System.out.println("Enter array elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=3;i++)
        {
            for(int j=0; j<=3;j++)
            {
            a[i][j]=sc.nextInt();
            }
    }     
System.out.println("Elements are/n ");
       for(int i=0; i<=3;i++)
        {
            for(int j=0; j<=3;j++)
            {
            System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }     
        


        
    }
}