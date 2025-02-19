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

public class Insert_at_end {
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
	
	private Node insertatend(int data) {
		Node newnode = new Node(data);
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newnode;
		newnode.prev = temp;
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
		Insert_at_end DL = new Insert_at_end();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			DL.insert(m);
		}
        System.out.println("Enter the value :");
		int data = sc.nextInt();
		System.out.println("Original LL :");
		DL.traverseforward();
		DL.insertatend(data);
		System.out.println("\nNew LL :");
		DL.traverseforward();
		sc.close();

	}

}
