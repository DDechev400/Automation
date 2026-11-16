//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int number0 = 11;
        int number1 = 10;
        if (number0 > number1) {
            int buffer = 0;
            buffer = number0;
            number0 = number1;
            number1 = buffer;
        }
        System.out.println("number0 = " + number0);
        System.out.println("number1 = " + number1);

        // //
        //task2
        System.out.println("-----------------------------------------------------");
        double a = 4;
        double b = -25;
        double c = 20;

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0 detected");
        } else {
            double sum = a + b + c;
            if (sum > 0) {
                System.out.println("Positive");
            } else if (sum < 0) {
                System.out.println("Negative");
            } else
                System.out.println("Zero");
        }

        // //
        //task3
        System.out.println("-----------------------------------------------------");
        int dayNum = 4; //1-7

        switch (dayNum) {
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            case 7:
                System.out.println("Sunday"); break;
            default:
                System.out.println("Invalid day");
        }

        // //
        //task4
        int a0 = 1;
        int b0 = 1;
        int c0 = 1;

        if (a0 > b0 && a0 > c0 ) {
            System.out.println("a0 is the largest number = " + a0);
        } else if (b0 > a0 && b0 > c0) {
            System.out.println("b0 is the largest number = " + b0);
        } else if (c0 > a0 && c0 > b0) {
            System.out.println("b0 is the largest number = " + c0);
        } else System.out.println("a0 = b0 = c0");


        // //
        //task5
        //Convert a score 0-100 to a grade (90+ A, 80+ B, 70+ C, 60+ D, else F)
        int newNumber = 91;
        if (newNumber >= 80 && newNumber <90) {
            System.out.println("A");
        } else if (newNumber >= 90 && newNumber <= 100) {
            System.out.println("B");
        } else if (newNumber >= 70 && newNumber <80) {
            System.out.println("C");
        } else if (newNumber >= 60 && newNumber <70) {
            System.out.println("D");
        } else if (newNumber > 100 || newNumber < 0) {
            System.out.println("Invalid");
        } else
            System.out.println("F");

        // //
        //task6
        int score = 75;
        String result = score % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);

    }
}