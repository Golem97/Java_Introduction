public class BinaryTree {
	private BTNode root;
 
	public BinaryTree() {
		this.root = null;
	}

	public void add(String data) {
		if (root == null) {
			root = new BTNode(data);
		} else {
			boolean flag = false;
			double rnd;
			BTNode p = root;
			while (flag == false) {
				rnd = Math.random();
				if (rnd >= 0.5) {
					if (p.getRight() == null) {
						p.setRight(new BTNode(data));
                        p.getRight().setParent(p);
						flag = true;
					} else {
						p = p.getRight();
					}
				} else {
					if (p.getLeft() == null) {
						p.setLeft(new BTNode(data));
                        p.getLeft().setParent(p);
						flag = true;
					} else {
						p = p.getLeft();
					}
				}
			}
		}
	}

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}

}
