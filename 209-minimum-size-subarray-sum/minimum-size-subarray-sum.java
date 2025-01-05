class Solution {
    public int minSubArrayLen(int target, int[] nums) {
int minSizeWindow=Integer.MAX_VALUE;
int currentSum=0;

        int low=0;
        int high=0;

        while(high<nums.length){
            currentSum=currentSum+nums[high];
            high++;

            while(currentSum>=target){
                int window=high-low;
                minSizeWindow=Math.min(minSizeWindow,window);
                currentSum=currentSum-nums[low];
                low++;
             }


        }

        if(minSizeWindow==Integer.MAX_VALUE)
        return 0;
        else
        return minSizeWindow;
        
    }
}