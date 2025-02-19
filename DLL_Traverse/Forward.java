package DLL_Traverse;

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
public class Forward {
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
		Forward DL = new Forward();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			DL.insert(m);
		}
		DL.traverseforward();
		sc.close();

	}

}
