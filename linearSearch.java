package Searching;

public class linearSearch {

    static int LinearSearch(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,8,3,6,7};
        int result = LinearSearch(arr,1);
        System.out.println("target found at index = " + result);
    }
}
