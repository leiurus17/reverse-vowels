import java.util.*;

public class Main {

    static ArrayList vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void main(String[] args) {
        System.out.println("Input a string: ");

        Scanner sc = new Scanner(System.in);

        String theString = sc.nextLine();


        reversedVowels(theString);

        System.out.println("The input string is: " + theString);
    }

    private static String reversedVowels(String theString) {

        char[] theStringCharArray = theString.toCharArray();

        Map<Integer, Character> indexAndVowels = new HashMap<>();

        ArrayList vowelsInString = new ArrayList<>();
        ArrayList positionsOfVowelsInString = new ArrayList<>();

        for (int x = 0; x < theStringCharArray.length; x++) {

            char currentCharacter  = theString.charAt(x);

            if (vowels.contains(currentCharacter)) {

                indexAndVowels.put(x, currentCharacter);

                vowelsInString.add(currentCharacter);
                positionsOfVowelsInString.add(x);
                System.out.println(currentCharacter);
            }
        }

        System.out.println(positionsOfVowelsInString);

        Collections.sort(positionsOfVowelsInString, Collections.reverseOrder());

        System.out.println(positionsOfVowelsInString);

        for (int y = 0; y < positionsOfVowelsInString.size(); y++) {

        }



        return theStringCharArray.toString(); // TODO
    }
}
