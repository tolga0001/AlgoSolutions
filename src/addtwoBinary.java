public class addtwoBinary {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        char carry = '0';
        StringBuilder res = new StringBuilder();
        while (i >= 0 && j >= 0) {
            char cur_a = a.charAt(i);
            char cur_b = b.charAt(j);
            char sum = (char) (cur_a + cur_b + carry - 3 * '0');
            char digit = (char) (sum % 2 + '0');
            carry = (char) (sum  / 2 + '0');
            res.insert(0, digit);
            i--;
            j--;

        }
        if (i == -1) {
            while (j >= 0) {
                char cur_b = b.charAt(j);
                char sum = (char) (cur_b + carry - 2 * '0');
                char digit = (char) (sum % 2 + '0');
                carry = (char) (sum  / 2 + '0');
                res.insert(0, digit);
                j--;

            }
            if (carry != '0') {
                res.insert(0, '1');
                carry='0';
            }
        }
        if (j == -1) {
            while (i >= 0) {
                char cur_a = a.charAt(i);
                char sum = (char) (cur_a + carry - 2 * '0');
                char digit = (char) (sum % 2 + '0');
                carry = (char) (sum  / 2 + '0');
                res.insert(0, digit);
                i--;

            }
            if (carry != '0') {
                res.insert(0, '1');
            }

        }

        return res.toString();


    }

    public static void main(String[] args) {
        System.out.println(addBinary("100","110010"));
    }

}


