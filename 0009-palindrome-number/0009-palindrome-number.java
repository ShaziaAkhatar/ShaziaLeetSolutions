class Solution {
    public boolean isPalindrome(int x) {
          int num=x;
		int newnum=0;
        
        while(num>0){
            
           newnum =newnum*10 +num % 10;
            
            num=num/10;
        }
        
        if(newnum==x){
            return true;
        }
        
        return false;
        
    }
}