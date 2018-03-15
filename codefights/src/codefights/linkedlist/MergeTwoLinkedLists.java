package codefights.linkedlist;


public class MergeTwoLinkedLists {

	public static void main(String[] args) {
		ListNode<Integer> a = new ListNode<Integer>(1);
		ListNode<Integer> a2 = new ListNode<Integer>(1);
		ListNode<Integer> a3 = new ListNode<Integer>(2);
		ListNode<Integer> a4 = new ListNode<Integer>(6);
		a.next = a2;
		a2.next = a3;
		a3.next = a4;
		
		ListNode<Integer> b = new ListNode<Integer>(0);
		ListNode<Integer> b2 = new ListNode<Integer>(3);
		ListNode<Integer> b3 = new ListNode<Integer>(5);
		b.next = b2;
		b2.next = b3;
		
		
		MergeTwoLinkedLists s = new MergeTwoLinkedLists();
		a = s.mergeTwoLinkedLists(a, b);

		s.printListNodes(a);
	}
	
	ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
		ListNode<Integer> head = null;
		ListNode<Integer> previousNode = null;
		ListNode<Integer> currentNode1 = l1; 
		ListNode<Integer> currentNode2 = l2;
		
		
		while (currentNode1 != null || currentNode2 != null) {
			int tempValue = 0;
			if (currentNode1 == null) {
				//just attach the remaining nodes from l2 to the return list.
			} else if (currentNode2 == null) {
				return currentNode1;
			} else if (currentNode1.value < currentNode2.value) {
				tempValue = currentNode1.value;
				currentNode1 = currentNode1.next;
			} else {
				tempValue = currentNode2.value;
				currentNode2 = currentNode2.next;
			}
			//create new node
			ListNode<Integer> newNode = new ListNode<Integer>(tempValue);
			//make previous node link to the new node.
			
			if (head == null) {
				head = newNode;
			}
			if (previousNode != null) {
				previousNode.next = newNode;
			} else {
				previousNode = newNode;
			}
			

		}
		
		
		System.out.println("pause");
		return head;
	}
	

	void printListNodes(ListNode<Integer> l1) {
		ListNode<Integer> currentNode = l1;
		while (currentNode != null) {
			System.out.println(currentNode.value);
			currentNode = currentNode.next;
		}
	}

}
