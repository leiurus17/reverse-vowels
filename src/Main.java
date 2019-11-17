import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input a string: ");

        Scanner sc = new Scanner(System.in);

        String theString = sc.nextLine();

        System.out.println("The input string is: " + theString);
    }
}
