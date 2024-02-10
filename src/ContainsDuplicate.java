import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int curr : nums) {
            if (set.contains(curr)) {
                return true;
            }
            set.add(curr);

        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        if (containsDuplicate(nums)){
            System.out.println("duplicate exists");
        }
        else{
            System.out.println("all values are distinct");
        }

    }
}
