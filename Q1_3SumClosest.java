import java.util.*;
public class Q1_3SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int n = nums.length;
        int diff = (int)1e9;
        for(int i =0;i<n;i++){
            while(i>0&&i<n-2&&nums[i]==nums[i-1])i++;
            int j=i+1;
            int k =n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int tmp = Math.abs(sum-target);
                if(tmp<diff){
                    diff=tmp;
                    res=sum;
                }
                if (sum>target){
                    k--;
                }else{
                    j++;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
