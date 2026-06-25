package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {10,12,15,16,20,30,40,50};
        int target = 40;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==target){
                System.out.println("Element found at index " + mid);
                break;
            }
            else if (arr[mid]<target){
                start = mid+1;
            }else end = mid-1;
        }
    }
}
