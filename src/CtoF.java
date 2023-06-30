public class CtoF {public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempC = 0.0;
        double tempF = 0.0;
        String trash = "";
        String tryAgain ="Y/N";
        done = false;
        do
        {System.out.print("Enter temp in celsius: ");
            if (in.hasNextDouble())
            {
                tempC = in.nextDouble();
                tempF = ((tempC*9/5)+32);
                System.out.println("The temp in farenhiet  " + tempF);
                if(tempF == 32.0) {
                    System.out.println("The temperature you've entered is " + tempF + " which is a freezing point!");
                } else if (tempF == 212.0) {
                    System.out.println("The temperature you've entered is " + tempF + " which is a boiling point!");
                }
            } else
            {
                trash = in.next();
                System.out.println("You must enter a valid temp not: " + trash + "\n");
            }
                System.out.println ("wanna try again (Y/N)");
            in.nextLine ();
            tryAgain = in.nextLine ();
            if (tryAgain.equalsIgnoreCase ( "N" ))
            {
                done =true;}
            else if (tryAgain.equalsIgnoreCase ( "Y" ))
            {done=false;}
        }
        while (!done);
    }
}
