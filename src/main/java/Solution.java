import java.util.Arrays;

public class Solution {
    public static void summa(String[]args){
        int[] nums=new int[]{1,5,4,6};
        int target=9;

    }

        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            return null;
        }


}///456



