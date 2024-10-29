package Binary search;
// 33. search in rotated array
class Solution {
    int search(int[] nums, int target) {
       int pivot=findPivot(nums);
       if(pivot==-1){
          return binarySearch(nums,target,0,nums.length-1);
       }
       if(nums[pivot]==target){
           return pivot;
       }
       if(nums[0]>target){
          return binarySearch(nums,target,pivot+1,nums.length-1);
       }
      return binarySearch(nums,target,0,pivot-1);
       
   }
  int findPivot(int []arr){
       int start=0;
       int end=arr.length-1;
       while(start<=end){
       int mid=start+(end-start)/2;
       if( mid<end && arr[mid]>arr[mid+1]){
           return mid;
       }
       if(  mid>start && arr[mid-1]>arr[mid]){
           return mid-1;
       }
       if(arr[start]>=arr[mid]){
           end=mid-1;
       }
       if(arr[start]<arr[mid]){
           start=mid+1;
       }
 
      }
        return -1;
}
   int binarySearch(int []arr,int target,int s,int e){
          while(s<=e){
           int mid=s+(e-s)/2;
           if(arr[mid]==target){
               return mid;
           }
           if(arr[mid]>target){
               e=mid-1;
           }
           else{
               s=mid+1;
           }
           
          }
            return -1;
   }
}
