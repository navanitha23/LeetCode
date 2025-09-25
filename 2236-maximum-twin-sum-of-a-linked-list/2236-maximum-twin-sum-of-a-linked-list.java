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
    public int pairSum(ListNode head) {
        ListNode curr=head;
        Deque<Integer> v=new ArrayDeque<>();
        while(curr !=null){
            v.add(curr.val);
            curr=curr.next;
        }
        int sum=0;
        while(!v.isEmpty()){
            int s=v.peek()+v.peekLast();
            if(s>sum)
            sum=s;
            v.poll();
            v.pollLast();
        }
        return sum;
    }
}