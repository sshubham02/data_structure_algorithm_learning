package mathematics.trailing_zeros_in_factorial;

/*
Calculate using prime factorization
 */

public class Solution {
    public static void main(String[] args) {
        int n = 400;
        System.out.println("Trailing zeros for factorial of "+n+" is "+countZeros(n));
    }

    public static int countZeros(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res = res + n/i;
        }
        return res;
    }


}
