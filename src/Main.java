import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        double degC = 0;
        double degF;
        String trash = "";

        System.out.println("Input a temperature in Celcius: ");



        if (kb.hasNextDouble())
        {
            degC = kb.nextDouble();

            degF = ((degC * 9 / 5) + 32);

            System.out.println("The temperature in Farenheit is " + degF);
        }
        else
        {
            trash = kb.nextLine();
            System.out.println("You said the temperature was " + trash + ".\nRun the program again and enter a valid temperature.");
            System.exit(0);
        }





    }
}