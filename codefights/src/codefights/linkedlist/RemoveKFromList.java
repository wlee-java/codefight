package codefights.linkedlist;

public class RemoveKFromList {

	public static void main(String[] args) {
		
		RemoveKFromList s = new RemoveKFromList();
		int k = 1000;
		
		ListNode<Integer> l = new ListNode<Integer>(1000) ;
		ListNode<Integer> a = new ListNode<Integer>(1000) ;
//		ListNode<Integer> b = new ListNode<Integer>(2) ;
//		ListNode<Integer> c = new ListNode<Integer> (4) ;
//		ListNode<Integer> d = new ListNode<Integer>(5) ;
//		ListNode<Integer> e = new ListNode<Integer>(5) ;
//		ListNode<Integer> f = new ListNode<Integer>(7) ;
		
		l.next = a;
//		a.next = b;
//		b.next = c;
//		c.next = d;
//		d.next = e;
//		e.next = f;
		
		ListNode<Integer> answerNode = s.removeKFromList(l, k);
		ListNode<Integer> currentNode = answerNode;
		boolean hasNext = true;
		if (answerNode != null) {
			while (hasNext) {
				
				System.out.println(currentNode.value);
				
				if (currentNode.next != null) {
					currentNode = currentNode.next;
				}  else {
					hasNext = false;
				}	
			}

		}
	}
	
	ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
		if (l == null) {
			return null;
		}
		
		ListNode<Integer> newHead = new ListNode<Integer>(-9999);
		newHead.next = l;
		
		boolean hasNext = true;
		ListNode<Integer> prevNode= null;
		ListNode<Integer> currentNode = newHead;
		
		while (hasNext) {	
			if (currentNode.value != k) {
				prevNode = currentNode;
				if (currentNode.next != null) {
					currentNode = currentNode.next;
				} else {
					hasNext = false;
				}
			} else {
				// value = k
				if (currentNode.next != null) {
					currentNode = currentNode.next;
					if (prevNode != null) {
						prevNode.next = currentNode;
					}
					
				} else {
					if (prevNode != null) {
						prevNode.next = null;
					}
					
					hasNext = false;
				}
			}
		}
		
		if (newHead.next != null) {
			newHead = newHead.next;
		} else {
			newHead = null;
		}
		return newHead;
	}
}
 