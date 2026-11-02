import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Task 1 variables
        short tempC0 = 0;
        short tempC1 = 37;
        short tempC2 = 100;
        float tempF0;
        float tempF1;
        float tempF2;

        //Task 2 variables
        short initialNumber = 472;
        short hundreds;
        short tens;
        short ones;

        //Task 3 variables
        Scanner scanner1 = new Scanner(System.in); //allow the user to enter the year from the console
        short year;
        boolean leapYear;

        //Task 4 variables
        int numberX = 10;
        int numberY = 20;

        // /////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 1
        //F = C * 9 / 5 + 32
        System.out.println("-----------------------Task1-------------------------");
        tempF0 = (float) (((tempC0 * 9) / 5) + 32);
        System.out.println(tempC0 + " " + "degrees Celsius is equal to " + tempF0 + " " + "Fahrenheit");
        //System.out.println("-----------------------------------------------------");
        tempF1 = (float) (((tempC1 * 9f) / 5) + 32);
        System.out.println(tempC1 + " " + "degrees Celsius is equal to " + tempF1 + " " + "Fahrenheit");
        //System.out.println("-----------------------------------------------------");
        tempF2 = (float) (((tempC2 * 9f) / 5) + 32);
        System.out.println(tempC2 + " " + "degrees Celsius is equal to " + tempF2 + " " + "Fahrenheit");

        //Task 2
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------Task2-------------------------");
        hundreds = (short) (initialNumber / 100);
        tens = (short) ((initialNumber / 10) % 10);
        ones = (short) ((initialNumber % 100) % 10);
        //System.out.println(hundreds);
        //System.out.println(tens);
        //System.out.println(ones);
        System.out.println("Sum of the numbers from " + initialNumber + " is " + (hundreds + tens + ones));

        //Task 3
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------Task3-------------------------");
        System.out.println("Type year to check:");
        year = scanner1.nextShort();
        leapYear = year % 4 == 0; //&& year % 100 == 0 && year % 400 == 0; look at this later because some leap years need to be / by 100 and 400 as well
        System.out.println(year + " is leap year: " + leapYear);

        //Task 4
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------Task4-------------------------");
        numberX = numberX + numberY;
        //System.out.println(numberX);
        numberY = numberX - numberY;
        //System.out.println(numberY);
        numberX = numberX - numberY;
        //System.out.println(numberX);
        System.out.println("Initial X = 10 and initial Y = 20");
        System.out.println("Updated X = " + numberX + " " +  "and initial Y = " + numberY);

    }
}