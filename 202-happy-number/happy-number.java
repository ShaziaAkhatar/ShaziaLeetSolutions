class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
      do {
            slow=square(slow);
            fast=square(square(fast));
            if(slow==1){
                return true;
            }

        } while(slow!=fast);
        return false;
    }

   int square(int n){
        int ans=0;
        while(n>0){
             int reminder=n%10;
             ans=ans+reminder*reminder;
             n=n/10;
        }
       return ans;

    }
}