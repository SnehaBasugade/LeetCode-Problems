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
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
        ListNode s = list1;
        ListNode b = list2;

        ListNode temp = head;

        while (temp != null){
            if(temp.val < x){
                s.next = temp;
                s = s.next;
            }else{
                b.next = temp;
                b = b.next;
            }
            temp = temp.next;
        }
        s.next = list2.next;

        b.next = null;

        return list1.next;
    }
}