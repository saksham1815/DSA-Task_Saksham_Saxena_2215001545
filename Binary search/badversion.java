package Binary search;
// 278. First Bad Version
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n ; 
        while(start<=end){
            int mid = start +(end- start)/2;
            if(!isBadVersion(mid)){
                // return mid;
                start = mid+1;
            }else{
                end = mid - 1;
            }           
        }
        return start;
    }
}