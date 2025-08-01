import util.ListNode;
import java.util.Stack;
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> valueStack= new Stack<>();
        while(head!=null){
            valueStack.push(head.val);
            head=head.next;
        }
        ListNode reversedList=new ListNode(Integer.MIN_VALUE);
        ListNode ptr= reversedList;
        while(!valueStack.isEmpty()){
            ptr.next = new ListNode(valueStack.pop());
            ptr=ptr.next;
        }
        return reversedList.next;
    }
}

