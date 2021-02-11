

public class BTNode {
	 private String data;
	 private BTNode right, left, parent;

	public BTNode(String data) {
		this.data = data;
		right = parent = left = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}
	public BTNode getParent() {
		return parent;
	}

	public void setParent(BTNode parent) {
		this.parent = parent;
	}
	public String toString() {
		return data;
	}
	
}
