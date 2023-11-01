import java.util.HashSet;

public class PanagramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {

        input = input.replaceAll(" ", "").toLowerCase();

        HashSet<Character> seenLetters = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                seenLetters.add(c);
            }
        }

        return seenLetters.size() == 26;
    }
}
