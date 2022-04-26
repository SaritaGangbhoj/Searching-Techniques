package SearchingTechniques;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 18, 20, 40, 45, 66, 80, 90};
        int target = 45;
        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                System.out.println("Found");
                index = mid;
                break;
            }
        }
        if (start > end){
            System.out.println("Not found");
        }
        else {
            System.out.println("Index: " +index);
        }
    }
}
