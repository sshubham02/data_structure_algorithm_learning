package mathematics.count_integer_digits;

public class Solution {

    public static void main(String[] args) {
        int data = 789;
        int result = countDigits(data);
        System.out.println("count of digits in "+data+" is "+result);
    }

    private static int countDigits(int x){
        int res = 0;
        while(x>0){
            x=x/10;
            res++;
        }
        return res;
    }
}
