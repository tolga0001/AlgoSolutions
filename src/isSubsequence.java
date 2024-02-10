public class isSubsequence {
    public static void main(String[] args) {
        String s = "";
        String t = "ahbgdc";

        if (isSubsequence(s, t)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    private static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int s_len = s.length(); //i
        int t_len = t.length(); // j

        while (j < t_len) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;

            }
            j++;
            if (i == s_len) {
                return true;
            }
        }
        return i == s_len;

    }
}


