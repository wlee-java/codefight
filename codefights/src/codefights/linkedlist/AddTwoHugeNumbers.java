package codefights.linkedlist;

public class AddTwoHugeNumbers {

	
	public static void main(String[] args) {
		ListNode<Integer> a = new ListNode<Integer>(123);
		ListNode<Integer> a2 = new ListNode<Integer>(4);
		ListNode<Integer> a3 = new ListNode<Integer>(5);
		a.next = a2;
		a2.next = a3;
		
		ListNode<Integer> b = new ListNode<Integer>(100);
		ListNode<Integer> b2 = new ListNode<Integer>(100);
		ListNode<Integer> b3 = new ListNode<Integer>(100);
		b.next = b2;
		b2.next = b3;
		
		AddTwoHugeNumbers s = new AddTwoHugeNumbers();
		System.out.println(s.addTwoHugeNumbers(a, b));

	}
	
	ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
	    ListNode<Integer> result = new ListNode<Integer>(0);
	    ListNode<Integer> head = result;
	    int carry=0;
	    a= reverse(a);
	    b= reverse(b); 
	    while(a!=null || b!=null){
	        if(a!=null){
	            carry+= a.value;
	            a=a.next;
	        }
	        if(b!=null){
	            carry+=b.value;
	            b= b.next;
	        }
	        head.next = new ListNode<Integer>(carry%10000);
	        head = head.next;
	        carry = carry/10000;
	    }
	    if(carry>=1)
	        head.next= new ListNode<Integer>(carry);
	    
	    return reverse(result.next);
	    
	}

	ListNode<Integer> reverse(ListNode<Integer> head){
	    ListNode<Integer> prev =null;
	    while(head!=null){
	        ListNode<Integer> temp = head.next;
	        head.next= prev;
	        prev= head;
	        head= temp;
	    }
	    return prev;
	}

}
