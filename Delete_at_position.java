import java.util.Scanner;

class Node{
	int data;
	Node next,prev;
	public Node(int item){
		data = item;
		next = null;
		prev = null;
	}
}

public class Delete_at_position {
	private Node head;

	public void insert(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newnode;
		newnode.prev = temp;
	}
	
	private Node deleteatposition(int pos) {
		
		if(pos<1) {
			System.out.println("Invalid Position");
			return head;
		}
		
		if(head == null) {
			return head;
		}
		
		if(pos == 1) {
			head = head.next;
			head.prev = null;
			return head;
		}
		
		Node temp = head;
		int count = 1;
		while(temp!=null && count < pos -1) {
			temp = temp.next;
			count++;
		}
		
		if(temp == null || temp.next == null) {
			System.out.println("Invalid Position");
			return head;
		}
		Node deletenode = temp.next;
		temp.next = deletenode.next;
		if(temp.next!=null)
			   temp.next.prev = temp;
		return head;
	}
	
	public void traverseforward() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Delete_at_position DL = new Delete_at_position();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			DL.insert(m);
		}
		System.out.println("Enter the position :");
		int pos = sc.nextInt();
		System.out.println("Original LL :");
		DL.traverseforward();
		DL.deleteatposition(pos);
		System.out.println("\nNew LL :");
		DL.traverseforward();
		sc.close();

	}

}
