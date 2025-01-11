/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tmp=head;
   boolean flag=false;
        ListNode i;
        HashMap<ListNode,Boolean> hm=new HashMap<>();
     for(i=head;i!=null;i=i.next){
        if(hm.containsKey(i)) return true;
        hm.put(i,true);
     }
     return false;
        
    }
}