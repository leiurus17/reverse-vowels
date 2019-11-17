import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static ArrayList vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void main(String[] args) {
        System.out.println("Input a string: ");

        Scanner sc = new Scanner(System.in);

        String theString = sc.nextLine();

        System.out.println("The input string is: " + theString);
        System.out.println("The output string is: " + reversedVowels(theString));
    }

    private static String reversedVowels(String theString) {

        char[] theStringCharArray = theString.toCharArray();

        Map<Integer, Character> indexAndVowels = new TreeMap<>();

        for (int x = 0; x < theStringCharArray.length; x++) {

            char currentCharacter  = theString.charAt(x);

            if (vowels.contains(currentCharacter)) {

                indexAndVowels.put(x, currentCharacter);

                System.out.println(currentCharacter);
            }
        }

        System.out.println(indexAndVowels);

        Map<Integer, Character> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());

        reverseSortedMap.putAll(indexAndVowels);

        System.out.println(reverseSortedMap);

        for (Map.Entry<Integer,Character> entry : reverseSortedMap.entrySet()) {
            theStringCharArray[entry.getKey()] = entry.getValue();
        }

        return String.copyValueOf(theStringCharArray);
    }
}
