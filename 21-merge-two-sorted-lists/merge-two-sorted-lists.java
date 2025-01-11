/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       /* ListNode current=list1;
        
        if(list1==null && list2==null){
            return list1;
        }if(list1==null){
            return list2;
        }if(list2==null){
            return list1;
        }
        while(current.next!=null){
          current=current.next;
        }
       current.next=list2;

        return list1;*/


        ListNode resultNode= new ListNode(Integer.MIN_VALUE);
        ListNode headNode=resultNode;
        while(list1!=null && list2!=null){
            if(list1.val <list2.val){
                resultNode.next=list1;
                list1=list1.next;
            }else{
                resultNode.next=list2;
                list2=list2.next;
            }
            resultNode=resultNode.next;
        }

        while(list1!=null){
            resultNode.next=list1;
            list1=list1.next;
             resultNode=resultNode.next;
        }
        while(list2!=null){
            resultNode.next=list2;
            list2=list2.next;
             resultNode=resultNode.next;
        }
        return headNode.next;
    }
}