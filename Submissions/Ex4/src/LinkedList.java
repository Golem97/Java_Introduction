
public class LinkedList {
	private Node head;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void AddFirst(String data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node p = new Node(data, head);
			head = p;
		}
		size++;
	}

	public void AddLast(String data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node p = head;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(new Node(data));
		}
		size++;
	}

	public String toString() {
		String st = "";
		Node p = head;
		while (p != null) {
			st += "-> " + p;
			p = p.getNext();
		}
		st += "-> null";
		return "Size: " + size + "\n" + st;
	}

	public Node Search(String data) {
		Node p = head;
		while (p != null && !(p.getData().equals(data))) {
			p = p.getNext();
		}
		return p;
	}

	public Node Remove(String data) {
		if (head.getData().equals(data)) {
			Node p = head;
			head = head.getNext();
			p.setNext(null);
			size--;
			return p;
		} else {
			Node curr, prev;
			prev = null;
			curr = head;
			while (curr != null && !(curr.getData().equals(data))) {
				prev = curr;
				curr = curr.getNext();
			}
			if (curr != null) {
				prev.setNext(curr.getNext());
				curr.setNext(null);
				size--;
			} else {
				System.err.println("The element " + data + " is not in the list!");
			}
			return curr;
		}
	}

}
