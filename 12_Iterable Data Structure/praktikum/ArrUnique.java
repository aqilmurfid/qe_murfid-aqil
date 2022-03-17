import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ArrUnique {

    public static void main(String[] args) {
        Integer[] ar1 = {1, 2, 3, 4};
        Integer[] ar2 = {1,3,5,10,16};

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < ar1.length; i++) {
            boolean sama = false;
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {
                    sama = true;
                    break;
                }
            }
            if (!sama) {
                result.add(ar1[i]);
            }
        }
        System.out.println(result);
    }
}