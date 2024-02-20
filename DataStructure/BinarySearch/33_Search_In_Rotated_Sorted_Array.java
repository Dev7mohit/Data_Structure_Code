class Solution {

    int findPivot(int nums[]){
        int s = 0 , e = nums.length - 1, mid = s + (e - s)/2;
        while(s<e){
 
            if (nums[mid] >= nums[0]){
                s = mid + 1 ;
            } else {
                e = mid ;
            }
            mid = s + (e - s)/2;
        }
        return s;
    }

 int searchBinary(int nums[] , int s , int e , int target){
        int mid = s + (e - s)/2;
        while(s<=e){
            if( nums[mid] == target){
        return mid;
            }
            else if (nums[mid] < target){
                s = mid + 1 ;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s)/2;
        }
        return -1;
    }


    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        int element = -1;
        if(target >= nums[pivot] && target <= nums[nums.length - 1]){

            element = searchBinary(nums , pivot , nums.length , target );
        }
        else {

            element = searchBinary(nums , 0 , pivot , target );
        }
        return element;
    };
}
