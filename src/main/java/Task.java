import java.util.HashMap;

public class Task {
    public boolean isUpperCase(String str){
        return false;

    }
    public int[] twoSum(int[]nums, int target){
     Map<Integer,Integer>map=new HashMap<3,2>();
        for (int i = 0; i < nums.length; i++) {
            int curr= nums[i];
            int x= target-curr;
            if(map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }

            }

        }
    }
}
