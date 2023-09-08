import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        System.out.println("Please enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
        double halfUserAge = userAge/2.0;
        double dateableAge = halfUserAge+7.0;
        System.out.println(userAge + " year olds should date somebody who is at least " + dateableAge + " years old.");



    }
}
