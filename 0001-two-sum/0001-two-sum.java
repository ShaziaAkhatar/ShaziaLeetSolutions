class Solution {
    public int[] twoSum(int[] nums, int target) {
        
             	int [] result = new int [2];
		for (int i=0;i<nums.length;i++) {
			
			int firstnum=nums[i];
			
			for (int j=i+1;j<nums.length; j++) {
				if (firstnum + nums[j]==target) {
					result[0] =i;
					result[1] =j;
					
					break;
				}
			}
			
		}
        return result;
    }
        
    }
