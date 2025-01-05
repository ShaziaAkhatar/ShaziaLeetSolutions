class Solution {
    public int lengthOfLongestSubstring(String s) {
        
int low=0;
int high=0;
int maxLength=0;
HashSet <Character> hset = new HashSet<>();
while(high<s.length()){

    if(!hset.contains(s.charAt(high))){
             hset.add(s.charAt(high));
            high++;
            maxLength = Math.max(maxLength,hset.size());

    }else{

        while(s.charAt(low)!=s.charAt(high)){
        hset.remove(s.charAt(low));
        low++;
        }
        hset.remove(s.charAt(high));
        low++;

    
    }



}
return maxLength;
    }
}