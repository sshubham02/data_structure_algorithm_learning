package mathematics.check_prime;

public class Solution {
    public static void main(String[] args) {
        int n = 455678;
        if(checkPrime(n)){
            System.out.println(n+" is non prime number");
        }else{
            System.out.println(n+" is prime number");
            printPrimeFactors(n);
        }
    }
    private static boolean checkPrime(int n){
        if(n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    private static void printPrimeFactors(int n){
        if(n<=1) System.out.println("no prime factors for numbers equal to or less than 1");
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while (n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            while (n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3){
            System.out.println(n);
        }
    }
}
