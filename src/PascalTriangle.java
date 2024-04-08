import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);
        res.add(new ArrayList<>(List.of(1)));
        List<Integer> curr;
        List<Integer> prev = res.get(0);
        for (int row = 2; row <= numRows; row++) {
            curr = getRow(prev);
            res.add(curr);
            prev = curr;
        }
        return res;


    }

    public static void main(String[] args) {
        PascalTriangle p = new PascalTriangle();
        System.out.println(p.generate(5));
    }

    private List<Integer> getRow(List<Integer> prev) {
        List<Integer> rowList = new ArrayList<>();
        rowList.add(1);
        rowList.add(1);
        int j = 1;
        for (int i = 1; i < prev.size(); i++) {
            int prevNum = prev.get(i - 1);
            int curNum = prev.get(i);
            int sum = prevNum + curNum;
            rowList.add(j, sum);
            j++;

        }

        return rowList;
    }

    ;
}

