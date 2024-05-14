package mathematics.greatest_common_divisor;

public class Solution {
    public static void main(String[] args) {
        int a=25,b=100;
        System.out.println("Greatest common divisor of ("+a+","+b+") is " + gcd(a,b));
    }
    private static int gcd(int a,int b){
        if(b==0){
            return a;
        }else {
            return gcd(b, a % b);
        }
    }
}
