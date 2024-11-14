class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> val = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			val.put(nums[i], val.getOrDefault(nums[i], 0)+1);
		}
		
		int maj=nums.length/2;
		
		for(Map.Entry<Integer, Integer> entry:val.entrySet()) {
			if(entry.getValue()>maj) {
				return entry.getKey();
			}
		}
        return 0;
        
    }
}