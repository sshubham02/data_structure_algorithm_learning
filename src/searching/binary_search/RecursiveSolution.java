package searching.binary_search;

public class RecursiveSolution {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int ele = 20;
        System.out.println("element "+ele+" is present at index "+binarySearch(arr,ele,0,arr.length-1));
    }

    private static int binarySearch(int[] arr,int ele,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid]==ele) return mid;
        else if (ele<arr[mid])
            return binarySearch(arr,ele,low,mid-1);
        else return binarySearch(arr,ele,mid+1,high);
    }
}
