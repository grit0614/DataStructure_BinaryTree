
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.getRoot().addLeftChild("1. Mammal");
		tree.getRoot().addRightChild("2. Birds");
		tree.getRoot().getLeftChild().addLeftChild("1-1. Dog");
		tree.getRoot().getLeftChild().addRightChild("1-2. Cat");
		tree.getRoot().getRightChild().addLeftChild("2-1. Sparrow");
		tree.getRoot().getRightChild().addRightChild("2-2. Eagle");
		
		
		
//		tree.getRoot().printData();
//		tree.getRoot().getRightChild().printData();
//		tree.getRoot().getRightChild().getRightChild().printData();
//		tree.getRoot().getLeftChild().getRightChild().printData();
		
		// Create a nodelist with preorder traversal, starting from nodelist[0]
		System.out.println("Preorder Travrsal\n=======================");
		tree.preorder(tree.getRoot());
		System.out.println();
		System.out.println("Postorder Travrsal\n=======================");
		tree.postorder(tree.getRoot());
		
		
		// Display NodeList Status
		System.out.println("\n\n\n");
		for (int i=0; i<tree.getNodes(); i++)
			System.out.println("Nodelist[" + i + "] = " + tree.getNodeList(i).getData());
		
		
		
		// Display the depth of each nodes
		System.out.println("\n\n\n");
		for (int i=0; i<tree.getNodes(); i++) System.out.println("Depth of NodeList[" + i + "] = " + depth(tree, tree.getNodeList(i)));
		
		// Display the height of the tree using height1 method
		System.out.println("\n\n\n");
		System.out.println("Height of this tree = " + height1(tree));
		
		// Display each height of nodes within the tree
		System.out.println("\n\n\n");
		for (int i=0; i<tree.getNodes(); i++) System.out.println("Height of NodeList[" + i + "] = " + height2(tree, tree.getNodeList(i)));
		
		
		
		// Test
		//System.out.println("\n\n\n");
		//System.out.println(tree.isRoot(tree.getNodeList(0)));
		//System.out.println(tree.getNodeList(0).getParent());
		
		//System.out.println(tree.getNodeList(1).getParent().getData());
		//System.out.println(tree.getNodeList(1).getLeftChild().getData());
	}

	
	
	
	
	public static int depth (Tree T, Node v) {
		if (T.isRoot(v)) 
			return 0;
		else 
			return 1 + depth(T, v.getParent());
	}
	
	
	public static int height1 (Tree T) {
		int h = 0;
		for (int i=0; i<T.getNodes(); i++) {
			
			if ( T.isExternal(T.getNodeList(i)) )
				h = Math.max(h,  depth(T, T.getNodeList(i) ));
		}
		return h;
	}
	
	
	public static int height2 (Tree T, Node v) {
		if (T.isExternal(v)) 
			return 0;
		int h = 0;
		for(int i=0; i < v.getChildren(); i++) {
			if (i==0) h = Math.max(h,  height2(T, v.getLeftChild()));
			if (i==1) h = Math.max(h,  height2(T, v.getRightChild()));
		}
		return 1+h;
	}
	
}
