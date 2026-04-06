import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(7, 6, 3, 4, 5, 3, 7, 8, 9, 4, 5, 6, 7, 3, 3, 4, 6)
        );

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            int j = i + 1;

            while (j < list.size() && i != list.size() - 1 && list.get(i).equals(list.get(j))) {
                list.remove(j);
            }
        }

        System.out.println(list);
    }
}
