public class MergeStrings {
    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();
        char first_appended;
        char second_appended;
        StringBuilder str = new StringBuilder(len1 + len2);

        do {
            first_appended = word1.charAt(i);
            second_appended = word2.charAt(i);
            str.append(first_appended).append(second_appended);
            i++;
        } while (i < len1 && i < len2);
        if (i == len1) {
            str.append(word2.substring(i));
        }
        if (i == len2) {
            str.append(word1.substring(i));
        }
        return str.toString();

    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));


    }
}
