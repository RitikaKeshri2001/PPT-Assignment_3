public class Q3_NextPermutation {
    public static void reverse(int[] nums, int i, int j) {
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void nextPermutation(int[] nums) {
        int idx = -1, n = nums.length;
        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }
        if(idx == -1) {
            reverse(nums, 0, n-1);
            return;
        }
        for(int i=n-1; i>=idx; i--) {
            if(nums[idx] < nums[i]) {
                //swap
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums, idx+1, n-1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
