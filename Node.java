
public class Node {
	private Object data;
	private Node left;
	private Node right;
	private Node parent;
	
	public Node(Object data, Node parent) {
		this.data = data;
		this.parent = parent;
		left=null;
		right=null;
	}
	
	public void addLeftChild(Object data) {
		Node temp = new Node(data,this);
		left=temp;
	}
	
	public void addRightChild(Object data) {
		Node temp = new Node(data,this);
		right=temp;
	}
	
	public Node getLeftChild() {
		return left;
	}

	public Node getRightChild() {
		return right;
	}
	
	public void printData() {
		System.out.println(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getParent() {
		return parent;
	}
	
	public int getChildren() {
		int count=0;
		if (left!=null) {
			count++;
			if(right!=null) {
				count++;
			}
		}
		return count;
	}
	
	// Preorder & Postorder traversal class
	public boolean isRoot() {
		if (parent == null) return true;
		else return false;
	}
	
	public boolean isLeft() {
		if (left == null) return false;
		else return true;
	}
	
	public boolean isRight() {
		if (right == null) return false;
		else return true;
	}
	
	public boolean isLeaf() {
		if (left == null && right == null) return true;
		else return false;
	}
}
