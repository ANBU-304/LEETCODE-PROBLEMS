/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {        
        return bs(1,n);
    }
    public int bs(int low, int high)
    {
        //base case
        if(low>high)    return low;
        int mid=low+(high-low)/2;

        //check before versions.
        if(isBadVersion(mid))   return bs(low,mid-1);
        //check after versions.
        return bs(mid+1,high);
    }
}