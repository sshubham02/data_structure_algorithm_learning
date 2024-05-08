package mathematics.palindrome_number;

public class Solution {
    public static void main(String[] args) {
        int number = 7667;
        if(palindrome(number)){
            System.out.println(number +" is palindrome");
        }else{
            System.out.println(number +" is not palindrome");
        }
    }

    private static boolean palindrome(int n){
        int temp=n,last,rev=0;

        while(temp>0){
            last = temp % 10;
            rev = (rev*10)+last;
            temp = temp/10;
        }
        return rev == n;
    }
}
