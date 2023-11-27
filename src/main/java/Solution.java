public class Solution {

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
        public class polindromeword{
            public static void check(String[]args){
                String s ="kayak";
                System.out.println(isPalindrome(s)? "yes":"no");
            }

        }
        public static boolean isPalindrome(String s){
            if (s.length()==1||s.length()==0)
                return true;
            if (s.charAt(0)==s.charAt(s.length()-1))
                return isPalindrome(s.substring(1,s.length()-1));
            return false;
    }

    public class ReverseString{
        public static void reverse(String[]args){
            String str ="hello";
            String rev=" ";
            char a[]=str.toCharArray();
            int len= a.length;
            for (int i =len-1; i>=0 ; i--) {
                rev=rev+a[i];

            }

        }
    }

}



