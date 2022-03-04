package myProject;

public class RotateList {

	/*
	 * Given the head of a linked list, rotate the list to the right by k places.
	 

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]


Example 2:

Input: head = [0,1,2], k = 4
Output: [2,0,1]
	 */
	
	public static class ListNode {
		    int val;
		    ListNode next;
		    ListNode() {}
		    ListNode(int val) { this.val = val; this.next=null; }
		    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
		 
		    public static ListNode rotateRight(ListNode head, int k) {
		    if(head==null || head.next==null){
		            return head;
		        }

		        ListNode tail = head;
		        int length=1;
		        while(tail.next!=null){ // Finds the tail and the length of the provided linked list
		            tail=tail.next;
		            length++;
		        }
		        tail.next = head; // Making it a circular linked list.

		        int stepRotate = length-(k%length); // Number of steps to move in the list

		        for(int i=0;i<stepRotate;i++){
		            head=head.next;
		            tail=tail.next;
		        }
		        tail.next=null;

		        return head;
		    }
		    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode e=new ListNode(5,null);
		ListNode d=new ListNode(4,e);
		ListNode c=new ListNode(3,d);
		ListNode b=new ListNode(2,c);
		ListNode a=new ListNode(1,b);
		ListNode t=a;
		
		System.out.print(" | ");
		while(t.next!=null)
		{
			System.out.print(t.val+" | ");
			t=t.next;
		}
		System.out.println("\n");
		
		
		ListNode newHead=rotateRight(a, 2);
		System.out.println("k=2 : ");
		System.out.print(" | ");
		while(newHead.next!=null)
		{
			System.out.print(newHead.val+" | ");
			newHead=newHead.next;
		}
		System.out.println("");
	}

}
