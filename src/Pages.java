import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        System.out.println("Please enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
        int pages = 100-userAge;
        System.out.println(userAge + " year olds should read at least " + pages + " before giving up on a book.");


    }
}
