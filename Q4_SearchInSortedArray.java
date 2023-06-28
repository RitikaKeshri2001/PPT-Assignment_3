public class Q4_SearchInSortedArray {

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n-1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(target < nums[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int target = 5;
        System.out.println(search(nums, target));
    }
}
