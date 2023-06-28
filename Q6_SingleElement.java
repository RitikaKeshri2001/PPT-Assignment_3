public class Q6_SingleElement {
    public static int singleEle(int[] nums) {
        int ans = 0; // XOR with 0 returns same number
        for(int i=0; i<nums.length; i++) {
            ans ^= nums[i];  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1};
        System.out.println(singleEle(nums));
    }
}
