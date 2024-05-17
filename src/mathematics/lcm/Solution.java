package mathematics.lcm;

public class Solution {
    public static void main(String[] args) {
        int a=200,b=400;
        int gcd = gcd(a,b);
        System.out.println("GCD of ("+a+","+b+") is "+gcd);
        System.out.println("LCM of ("+a+","+b+") is "+lcm(a,b,gcd));
    }
    private static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    private static int lcm(int a,int b,int gcd){
        return (a*b)/gcd;
    }

}
