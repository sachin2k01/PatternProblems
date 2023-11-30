import java.util.Scanner;
public class Pattern7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int r=sc.nextInt();
        for (int i=1;i<=r;i++)
        {
            for (int k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=r;j>=i;j--)
            {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
