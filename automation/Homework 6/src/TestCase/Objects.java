package TestCase;

public class Objects {

    public static void main(String[] args) {
        TestCase first = new TestCase(1, "Check name");
        TestCase second = new TestCase(2, "Check Age");
        TestCase third = new TestCase(3, "Check Gender");
        TestCase fourth = new TestCase(4, "Check country");

        System.out.println(first.getTestCaseStatus());

        //positive
        first.setStatus("PASSED");
        System.out.println(first.getTestCaseStatus());
        second.setStatus("FAILED");
        System.out.println(second.getTestCaseStatus());
        third.setStatus("SKIPPED");
        System.out.println(third.getTestCaseStatus());

        //count
        System.out.println(first.getTestCaseCounter());

        //describe
        System.out.println(first.describe());
        System.out.println(second.describe());
        System.out.println(third.describe());

        //negative tests
        //first.setStatus("123");
        //System.out.println(first.getTestCaseStatus());

        //first.setStatus("passed");
        //System.out.println(first.getTestCaseStatus());

        //first.setStatus("fAiLed");
        //System.out.println(first.getTestCaseStatus());

        first.setStatus("skipped");
        System.out.println(first.getTestCaseStatus());



    }
}
