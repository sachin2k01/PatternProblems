import java.util.Scanner;

public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of lines");
        int n=s.nextInt();
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k=0;k<n-1;k++)
        {
            for(int j=n-1;j>k;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
