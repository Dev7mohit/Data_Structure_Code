class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int size = arr.size();
        int start = 0 , end = size - 1;
        int mid = start + (end - start )/2;
        int ans = -1;
        while(start <= end ){
            if(arr[mid - 1] < arr[mid] &&  arr[mid]  > arr[mid + 1]){
                ans = mid;
                break;
            }
            else if(arr[mid - 1] < arr[mid]){
                start = mid ;
            }else{
                end = mid ;
            }
            mid = start + (end - start )/2;
        } 
        return ans; 
    }
};
