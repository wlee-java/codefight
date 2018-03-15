package codefights.linkedlist;

public class RearrangeLastN {

	public static void main(String[] args) {
		
		ListNode<Integer> a = new ListNode<Integer>(1);
		ListNode<Integer> a2 = new ListNode<Integer>(2);
		ListNode<Integer> a3 = new ListNode<Integer>(3);
		ListNode<Integer> a4 = new ListNode<Integer>(4);
		ListNode<Integer> a5 = new ListNode<Integer>(5);
//		ListNode<Integer> a6 = new ListNode<Integer>(6);
//		ListNode<Integer> a7 = new ListNode<Integer>(7);
		
		a.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
//		a5.next = a6;
//		a6.next = a7;
		
		RearrangeLastN s = new RearrangeLastN();
		ListNode.printListNodes(s.rearrangeLastN(a, 3));
	}
	
	// l = [1, 2, 3, 4, 5, 6, 7] and n = 1. rearrangeLastN(l, n) = [7, 1, 2, 3, 4, 5, 6]
	
	//count from back K nodes. Make that the new head.
	//find the previous node and make next null.
	//attach the previous head to the end of the new head
	
	ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
		int size = getCount(l);
		if (n == 0 || n >= size ) {
			return l;
		}

		ListNode<Integer> head = null;
		ListNode<Integer> oldHead = null;
		ListNode<Integer> previousNode = null;
		
		int stop = size - n + 1;
		int counter = 1;
		while (l != null) {
			if (oldHead == null) {
				oldHead = l;
			}
			if (counter == stop) {
				previousNode.next = null;
				head = l;
			}
			counter++;
			previousNode = l;
			l = l.next;
		}
		
		//reattach
		previousNode.next = oldHead;
		
		return head;
	}
	
	int getCount(ListNode<Integer> l) {
		
		int count=0;
		
		while (l !=null) {
			count++;
			l = l.next;
		}
		return count;
	}
}
