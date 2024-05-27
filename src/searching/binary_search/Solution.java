package searching.binary_search;

public class Solution {
    public static void main(String[] args) {
        int ele = 10;
        //int[] arr = {10,20,20,20,30,30};
        int[] arr = {10,10,10,10,10};
        //int[] arr = {5,8,10,10,10};
        System.out.println("element "+ele+" is present at index "+binarySearch(arr,ele));
        System.out.println("Index of last occurrence is "+binarySearchLastOccurrence(arr,ele));
        System.out.println("Index of first occurrence is "+binarySearchFirstOccurrence(arr,ele));
        System.out.println("All occurrence of "+ele+" is "+countOccurrence(arr,ele));
        System.out.println("Count of 1's in sorted binary array is "+countOnce());
    }

    //normal binary search
    private static int binarySearch(int[] arr,int ele){
        int low=0,high=arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(ele == arr[mid]){
                return mid;
            }else if(ele<arr[mid]){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }

    /*
    As there is multiple occurrence of 10 in arr, we need to fetch first occurring of 10
     */
    private static int binarySearchFirstOccurrence(int[] arr,int ele){
        int low=0,high=arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(ele<arr[mid]){
                high = mid -1;
            } else if (ele>arr[mid]) {
                low = mid+1;
            }else {
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    /*
    As there is multiple occurrence of 10 in arr, we need to fetch last occurring index of 10
     */
    private static int binarySearchLastOccurrence(int[] arr,int ele){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(ele<arr[mid]){
                high = mid-1;
            }else if(ele>arr[mid]){
                low = mid+1;
            }else{
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                }else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    /*
    Count all occurrence of ele in sorted array
     */
    private static int countOccurrence(int[] arr,int ele){
        int first = binarySearchFirstOccurrence(arr,ele);
        if(first == -1){
            return 0;
        }else {
            int last = binarySearchLastOccurrence(arr,ele);
            return (last-first)+1;
        }
    }

    /*
    Count once in sorted binary array.
    Binary array consists of zeros and one.
     */
    private static int countOnce(){
        int[] arr = {0,0,0,1,1,1,1,1,1};
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==0){
                low = mid+1;
            }else {
                if(mid==0 || arr[mid-1]==0){
                    return arr.length-mid;
                }else{
                    high = mid-1;
                }
            }
        }
        return 0;
    }
}
