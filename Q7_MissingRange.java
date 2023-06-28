import java.util.*;
public class Q7_MissingRange {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        ArrayList<String> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            // for 1 missing value
            if(lower < nums[i]) {
                if(nums[i]-lower == 1) {
                    res.add(lower+"");
                } else { // for missing range
                    res.add(lower + "->" +(nums[i]-1));
                }
            }
            if(nums[i] == Integer.MAX_VALUE) {
                return res;
            }
            lower = nums[i]+1;
        }
        if(lower < upper) {
            res.add(lower + "->" +upper);
        } else if(lower == upper) {
            res.add(lower + "");
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,3,50,75};
        int lower = 0, upper = 99;
        List<String> range = findMissingRanges(nums, lower, upper);
        for(String num: range) {
            System.out.print(num + " ");
        }
    }

}
