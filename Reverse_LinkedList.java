class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val = val;
  }
}
public class Reverse_LinkedList {
  public static void main(String[] args){
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    ListNode prev = null;
    ListNode curr = head;
    while(curr != null){
      ListNode temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    head = prev;
    while(head != null){
      System.out.println(head.val + "");
      head = head.next;
    }
  }
}
