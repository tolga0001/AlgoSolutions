import java.util.ArrayList;

public class listExercise {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int index = list.indexOf(4);
        System.out.println(index);
    }
}
