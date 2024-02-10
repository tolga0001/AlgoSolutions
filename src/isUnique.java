import java.util.HashSet;

public class isUnique {
    public static boolean isStatic(String str) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (characters.contains(ch)) {
                return false;
            }
            characters.add(ch);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStatic("bmnct"));
    }
}
