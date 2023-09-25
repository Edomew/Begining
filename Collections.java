import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(293);
        nums.add(1,44);
        for (Integer num: nums
             ) {
            System.out.println(num);
        }
        LinkedList<String> names = new LinkedList<>();
        names.add("Oleg");
        names.add("Georgy");
    }
}




