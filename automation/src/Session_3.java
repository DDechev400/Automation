public class Session_3 {
    public static void main(String[] args) {
        byte number_0 = 87;
        byte number_1 = -113;
        short number_2 = -20000;
        int number_3 = 51240;
        int number_4 = 4735941;

        boolean isFemale = false;

        String string_0 = "Hello";
        String string_1 = "World";
        String string_2 = "";

        Object object_0;

        String firstName;
        String familyName;
        byte age;
        String gender; //or maybe bool m or f
        int idNumber;
        int uniqueEmployeenNumber; //38560000 to 38569999

        int first = 5;
        int second = 10;
        int third;

        float numberFlout = 34.567839023F;
        double numberDouble = 34.567839023D; //do we need the D after the number???

        char symbol = 'A';
        char symbol_1 = (char) 72; //this is how you cast number to char

        int numberOfSeconds;
        long numberOfSecondsFull;

        Integer newIntegerNull = null;

        //For int x = 7, y = 2 print x / y, x % y, x / 2.0 and x > y
        int x = 7;
        int y = 2;

        int oddEven;
        boolean isEven;

        int width;
        int height;

        System.out.println("-----------------------------------------------------");
        System.out.println(number_0);
        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println(number_3);
        System.out.println(number_4);

        System.out.println("-----------------------------------------------------");
        System.out.println("Is my gender female: " + isFemale);

        System.out.println("-----------------------------------------------------");
        object_0 = string_0 + " " + string_1;
        System.out.println(object_0);

        string_2 = object_0.toString();
        System.out.println("This is string_2: " + string_2);

        System.out.println("-----------------------------------------------------");
        third = second;
        second = first;
        first = third;
        System.out.println("This is first: " + first + " " + "and" + " " + "This is second: " + second);

        System.out.println("-----------------------------------------------------");
        System.out.println(numberFlout); //34.56784 - the precision is just 7 digits, that's why
        System.out.println(numberDouble); //34.567839023 - precision of 15-16 digits

        System.out.println("-----------------------------------------------------");
        System.out.printf("The code of %s is %d", symbol, (int) symbol);
        System.out.println("");
        System.out.println("The symbol of the number 72 is: " + symbol_1);

        System.out.println("-----------------------------------------------------");
        numberOfSeconds = 100 * 365 * 24 * 60 * 60;
        numberOfSecondsFull = 100 * 365 * 24 * 60 * 60;

        System.out.println(numberOfSeconds); //int -1141367296 - int is the right type int (-2,147,483,648 to 2,147,483,647)
        System.out.println(numberOfSecondsFull); //long -1141367296

        System.out.println("Number of seconds in 100 years = " + numberOfSeconds);
        System.out.println("-----------------------------------------------------");

        System.out.println(newIntegerNull);
        System.out.println("-----------------------------------------------------");

        oddEven = 10;
        isEven = (oddEven % 2 == 0);
        System.out.println("Is the number: " + oddEven + " even: "+ isEven );
        System.out.println("-----------------------------------------------------");

        width = 10;
        height = 15;
        System.out.println("Area of rectangle is = " + width * height);

    }
}

