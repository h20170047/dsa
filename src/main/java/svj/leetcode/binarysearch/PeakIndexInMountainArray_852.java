package svj.leetcode.binarysearch;

public class PeakIndexInMountainArray_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int arrLen= arr.length, left= 0, right= arrLen-1, mid, result= right;
        while (left<= right){
            mid= (left+ (right-left)/2);
            if(arr[result]< arr[mid]) {
                result = mid;
                if(mid< right && arr[mid]< arr[mid+1])
                    left = mid;
                else
                    right= mid;
                System.out.printf("l: %d, m: %d, r: %d and result: %d \n", left, mid, right, arr[result]);
            }else{
                if(mid< right && arr[mid]< arr[mid+1])
                    left = mid+1;
                else
                    right= mid-1;
            }
        }
        return result;

//        int start=0, arrLen= arr.length, mid = 0, end= arrLen-1;
//        while(end> start){
//            mid= start+(end-start)/2;
//            if(arr[mid]> arr[mid+1])
//                end= mid;
//            else
//                start= mid+1;
//        }
//        return end;
    }
}
