public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int spaceIndex = -1;
        int length = s.length();
        if (length == 1) return 1;
        char ch;
        for (int i = 0; i < length - 1; i++) {
            ch = s.charAt(i);
            if (ch == ' ' && s.charAt(i + 1) != ' ') {
                spaceIndex = i;
            }
        }
        return getCount(s, length, spaceIndex);


    }

    private static int getCount(String s, int length, int spaceIndex) {
        int count = 0;
        int j = spaceIndex + 1;
        while (j < length) {
            if (s.charAt(j) == ' ') {
                break;
            }
            j++;
            count++;
        }
        return count;
    }
}
