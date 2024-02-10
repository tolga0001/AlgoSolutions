import java.util.*;

public class LetterCombinations {
    static HashMap<Character, Integer> phone = new HashMap<>();
    static int[] digitMap = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};


    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            int digitValue = digitMap[(letter - 'a')];
            phone.put(letter, digitValue);

        }
        char firstChar = getFirstChar(digits);
        List<String> combinations = new ArrayList<>();
        constructCombinations(firstChar, new StringBuilder(), combinations, digits, new boolean[26]);
        String firstDigitsLetters = getLetters(digits.charAt(0));
        System.out.println(firstDigitsLetters);
        int len = combinations.size();
        char ch;
        for (int i = 1; i < firstDigitsLetters.length(); i++) {
            ch = firstDigitsLetters.charAt(i);
            for (int j = 0; j < len; j++) {
                String curr = combinations.get(j);
                combinations.add(ch + curr.substring(1));
            }


        }


        return combinations;
    }

    private static String getLetters(char firstNum) {
        if (firstNum == '7') {
            return "pqrs";
        }
        if (firstNum == '8')
            return "tuv";
        if (firstNum == '9')
            return "wxyz";     // a b c -> 2  // d e f -> 3

        StringBuilder str = new StringBuilder();
        char first = (char) ('a' + (firstNum - '2') * 3);
        for (int i = 0; i < 3; i++) {
            char ch = (char) (first+i);
            str.append(ch);
        }

        return str.toString();
    }

    private static void constructCombinations(char firstChar, StringBuilder current, List<String> combinations, String digits, boolean visited[]) {
        current.append(firstChar);
        if (current.length() == digits.length()) {
            combinations.add(String.valueOf(current));
            current.deleteCharAt(current.length() - 1);
            return;
        }
        for (char letter = (char) (firstChar + 1); letter <= 'z'; letter++) {
            if (!doesExist(digits, letter))
                continue;
            if (HasSameDigit(current, letter))
                continue;
            constructCombinations(letter, current, combinations, digits, visited);


        }
        current.deleteCharAt(current.length() - 1);

    }

    private static boolean doesExist(String digits, char letter) {
        int key = phone.get(letter);
        int[] digitArr = convert(digits);
        for (int digit : digitArr) {
            if (key == digit) {
                return true;
            }


        }
        return false;
    }

    private static int[] convert(String digits) {
        int[] digitArr = new int[digits.length()];
        int num;
        for (int i = 0; i < digits.length(); i++) {
            num = digits.charAt(i) - '0';
            digitArr[i] = num;

        }
        return digitArr;
    }

    private static boolean HasSameDigit(StringBuilder comb, char letter) {
        // comb stringinde o letterin valuesu aynı olan bir letter olmaması lazım
        char ch;
        for (int i = 0; i < comb.length(); i++) {
            ch = comb.charAt(i);
            if (Objects.equals(phone.get(ch), phone.get(letter))) {
                return true;
            }


        }
        return false;
    }

    private static char getFirstChar(String digits) {
        char firstdigit = digits.charAt(0);
        return switch (firstdigit) {
            case '7' -> 'p';
            case '8' -> 't';
            case '9' -> 'w';
            default -> (char) ('a' + (firstdigit - '2') * 3);
        };

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("4567"));
       // System.out.println(getLetters('2'));


    }
}
