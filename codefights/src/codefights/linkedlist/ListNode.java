package codefights.linkedlist;

// Definition for singly-linked list:
class ListNode<T> {
	ListNode(T x) {
		value = x;
	}

	T value;
	ListNode<T> next;
	
	static void printListNodes(ListNode<Integer> l1) {
		ListNode<Integer> currentNode = l1;
		while (currentNode != null) {
			System.out.println(currentNode.value);
			currentNode = currentNode.next;
		}
	}
}
