package Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if (key > arr[mid]){
                start = mid+1;
            }else if (key < arr[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {45,78,90,112,456,951};
        int key = 112;
        System.out.println("Key at Index: "+binarySearch(arr,key));
    }
}
