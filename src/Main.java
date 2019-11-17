import java.util.*;

public class Main {

    private static ArrayList vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void main(String[] args) {
        System.out.println("Input a string: ");

        Scanner sc = new Scanner(System.in);

        String theString = sc.nextLine();

        System.out.println("The input string is: " + theString);
        System.out.println("The output string is: " + reversedVowels(theString));
    }

    private static String reversedVowels(String theString) {

        char[] theStringCharArray = theString.toCharArray();

        Stack<Character> vowelsInString = new Stack<>();
        ArrayList<Integer> positionsOfVowelsInString = new ArrayList<>();

        for (int x = 0; x < theStringCharArray.length; x++) {

            char currentCharacter  = theString.charAt(x);

            if (vowels.contains(currentCharacter)) {
                vowelsInString.add(currentCharacter);
                positionsOfVowelsInString.add(x);
            }
        }

        for (Object position : positionsOfVowelsInString) {
            theStringCharArray[(int) position] = (char) vowelsInString.pop();
        }

        return String.copyValueOf(theStringCharArray);
    }
}
