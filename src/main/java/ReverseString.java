public class ReverseString {

    public static void reversing (String[]args) {
        String str = "hello";

    }
        public  String Reverse (String str){
            String rev = " ";
        char a[]=str.toCharArray();
        int len= a.length;
        for (int i =len-1; i>=0 ; i--) {
            rev=rev+a[i];

        }
            return rev;
    }

}

//45212
