public class Floor {
    static void main(String[] args) {
        int[] arr= {2,3,4,6,9,14,16,18,35};
        int target = 1000;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target){
        if(target < arr[0])
            return -1;

        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left +(right-left)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return arr[right];
    }
}
