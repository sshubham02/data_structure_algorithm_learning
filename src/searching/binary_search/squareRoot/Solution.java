package searching.binary_search.squareRoot;

public class Solution {
    public static void main(String[] args) {
        int ele = 25;
        System.out.println("Square root of "+ele+" is "+squartRoot(ele));
    }
    private static int squartRoot(int ele){
        int low=1,high=ele,ans=0;
        while(low<=high){
            int mid = (low+high)/2;
            int squart = mid*mid;
            if(squart == ele){
                return mid;
            } else if(squart > ele){
                high = mid-1;
            }else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
