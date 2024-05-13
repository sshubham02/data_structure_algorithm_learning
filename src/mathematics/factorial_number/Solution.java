package mathematics.factorial_number;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial of "+n+" is "+factorialN(n));
        System.out.println("Factorial of "+n+" without recursion is "+factorial(n));
    }
    //with recursive
    private static int factorialN(int n){
        if(n==0){
            return 1;
        }
        return n*factorialN(n-1);
    }
    //without recursive function
    private static int factorial(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res = res*i;
        }
        return res;
    }
}
