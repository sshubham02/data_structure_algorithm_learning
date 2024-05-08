package mathematics.factorial_number;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial of n is "+factorialN(n));
    }
    private static int factorialN(int n){
        if(n==0){
            return 1;
        }
        return n*factorialN(n-1);
    }
}
