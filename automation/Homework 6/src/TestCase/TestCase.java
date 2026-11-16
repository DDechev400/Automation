package TestCase;

import java.util.Random;

public class TestCase {

    private int id;
    private String title;
    private String status;
    private static int testCaseCounter = 0; //added counter
    private int ms;

    public TestCase(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = "NOT_RUN";
        testCaseCounter = testCaseCounter + 1;
        Random r = new Random();
        this.ms = (r.nextInt(401) + 100);


    }

    public String getTestCaseStatus() {
        return "Test case with ID: " + id + " and Title: " + title + " is with status " + status + " and ms: " + ms;
    }
    public String getTestCaseCounter() {
        return "Test cases created so far: " + testCaseCounter;
    }

    public String setStatus(String newStatus) {
        if (newStatus == "PASSED" || newStatus == "FAILED" || newStatus == "SKIPPED") {
            return this.status = newStatus;

        }
        else {
            throw new IllegalArgumentException("Input status:" + newStatus + " is not allowed. Allowed statuses are PASSED/FAILED/SKIPPED");
        }
    }
    public String describe() {
        return "#" + id + " " + title + " [" + status + "]";
    }

}
