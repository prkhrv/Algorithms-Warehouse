import java.util.Collections;
import java.util.List;

public class BogoSort {
    private static boolean isSorted(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1))
                return false;
        }
        return true;
    }
    
    public static List<Integer> sort(List<Integer> nums) {
        if(isSorted(nums))
            return nums;
        
        do {
            Collections.shuffle(nums);
        } while (!isSorted(nums));
        
        return nums;
    }
}