class Solution {
    public int searchInsert(int[] nums, int target) {
         int position=0;
       for(int i=0;i<nums.length; i++) {
		
			if (nums[i] == target) {
				position=i;
				break;
			}else if(nums[i]<target){
				position =i+1;
			}else {
				break;
			}
			
		}
        
        return position;
        
    }
}