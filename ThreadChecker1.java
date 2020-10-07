package master.treadchecker;

import java.util.Scanner;
public class ThreadChecker1 {
    public static void main(String[] args) {

        System.out.println("Enter your password");
        Scanner scanner = new Scanner(System.in);
        scanner.next("ggg");
        System.out.println("It doesn't work");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        System.out.println("I slept 2 seconds");
    }
}
