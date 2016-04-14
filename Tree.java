
public class Tree {
	
	private Node root;
	private int nodecount;
	private Node[] nodelist = new Node[100];
	
	public Tree() {
		root = new Node("root", null);
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	// nodelist feature has been implemented
	// (saves the designated node to nodelist[i])
	public void preorder(Node t) {
		t.printData();
		
		// puts node in preorder
		nodelist[this.getNodes()] = t;
		this.setNodes(++nodecount);
		
		if(t.isLeft()) this.preorder(t.getLeftChild());
		if(t.isRight()) this.preorder(t.getRightChild());
	}
	
	public void postorder(Node t) {
		if(t.isLeft()) this.postorder(t.getLeftChild());
		if(t.isRight()) this.postorder(t.getRightChild());
		t.printData();
	}
	
	
	
	
	
	
	public void setNodes(int n) {
		this.nodecount = n;
	}
	
	public int getNodes() {
		return this.nodecount;
	}
	
	
	public Node getNodeList(int i) {
		return this.nodelist[i];
	}
	
	
	public boolean isRoot(Node v) {
		if (v.getParent() == null) return true;
		else return false;
	}
	

	
	public boolean isExternal(Node v) {
		if (v.getLeftChild() == null && v.getRightChild() == null) return true;
		else return false;
	}
}
