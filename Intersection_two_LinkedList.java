class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val = val;
  }
}

public class Intersection_two_LinkedList {
  public static void main(String[] args){
    ListNode headA = new ListNode(4);
    headA.next = new ListNode(1);
    headA.next.next = new ListNode(8);
    headA.next.next.next = new ListNode(4);
    headA.next.next.next.next = new ListNode(5);
    ListNode headB = new ListNode(5);
    headB.next = new ListNode(0);
    headB.next.next = new ListNode(1);
    headB.next.next.next = headA.next.next;
    ListNode ptrA = headA;
    ListNode ptrB = headB;
    while(ptrA != ptrB){
      ptrA = ptrA == null ? headB : ptrA.next;
      ptrB = ptrB == null ? headA : ptrB.next;
    }
    System.out.println("Intersection node: " + ptrA.val);
  } 
}
