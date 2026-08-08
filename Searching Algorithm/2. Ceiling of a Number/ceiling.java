public class Ceiling {
    static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18,20};
        int target=10;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left +(right - left)/2;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid]<target) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return arr[left];
    }
}
