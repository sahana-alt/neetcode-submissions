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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=0, num2=0;
        int c1=0;
        while(l1!=null){
            int val = l1.val;
            num1+= val*Math.pow(10,c1);
            c1++;
            l1=l1.next;
            
        }

        c1=0;
        while(l2!=null){
            int val = l2.val;
            num2+= val*Math.pow(10,c1);
            c1++;
            l2=l2.next;
            
        }

       
        int sum = num1+num2;
        System.out.println(num1+" "+num2+" "+sum);

        ListNode l3 = new ListNode(-1);
        ListNode cur = l3;
        if (sum == 0) {
    return new ListNode(0);
}

        while(sum>0){
            int dig = sum%10;
            ListNode n = new ListNode(dig);
            cur.next = n;
            sum = sum/10;
            cur = cur.next;

        }



        return l3.next;
        
    }
}
