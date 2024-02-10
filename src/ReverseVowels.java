import java.util.Arrays;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (isWovel(left) && isWovel(right)) {
                exchange(chars, i, j);
                i++;
                j--;
            }
            if (!isWovel(left)) {
                i++;
            }
            if (!isWovel(right)) {
                j--;
            }


        }
        return new String(chars);

    }

    private static void exchange(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static boolean isWovel(char ch) {
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        String str = reverseVowels("hello");
        System.out.println(str);

    }

}
