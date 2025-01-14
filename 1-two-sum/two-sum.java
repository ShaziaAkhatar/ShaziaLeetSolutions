class Solution {
    public int[] twoSum(int[] nums, int target) {
        
             /*	int [] result = new int [2];
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
        return result;*/

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        int[]result = new int[2];

         for(int i=0;i<nums.length;i++){
                
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getKey()!=i && entry.getValue()==target-nums[i]){
                    result[0]=i;
                    result[1]=entry.getKey();
                   return result;
                }
            }
         }
        
return result;
}
}
            
