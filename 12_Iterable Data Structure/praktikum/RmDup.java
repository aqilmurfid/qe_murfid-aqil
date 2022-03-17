import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class RmDup {

    public static void main(String[] args) {
        Integer[] input = {2,3,3,3,6,9,9};
        Set<Integer> inputSet = new HashSet<>(Arrays.asList(input));
        System.out.println(inputSet.size());
    }

}