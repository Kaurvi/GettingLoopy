import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        for(int c=0;
            c <= 30;
            c++)

        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        for(int c=30;
            c >= 0;
            c --)

        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        for ( int c =0; c<=18; c +=3)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        for ( int c = 10; c>=0; c -=2)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");
        ;


        String star ="";
        for(int c =0; c <5; c++)
        {
            for (int i =0; i <c; i++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }



        for(int c =5; c >0; c--)
        {
            for (int i=0; i<c; i++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }


        for(int c =0; c<5 ; c++)
        {
            for (int i=0; i<5; i++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}