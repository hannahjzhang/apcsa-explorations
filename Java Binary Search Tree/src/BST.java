public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left; 
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}
	
	public void setLeft(BST<T> tree) {
		left = tree;
	}

	public void setRight(BST<T> tree) {
		right = tree;
	}
	
	
	public int depth() {
		// start with 1 node
		// find the max between number of nodes in left and right
		int x = 0;
		int y = 0;
		
		BST<T> leftside = getLeft();
		BST<T> rightside = getRight();
		
		if (left == null && right == null)
		{
			return 1;
		}
		if (leftside != null)
		{
			x = 1 + leftside.depth();
		}
		if (rightside != null) 
		{
			y = 1 + rightside.depth();
		}
		
		return Math.max(x, y);
		
	}

	// recursive (calling insert again)
	public void insert(T datum) {
		
		if (this.datum.compareTo(datum) == 0)
		{
			System.out.println("number already in the tree");
			return;
		}
		// no need for a variable current because it never changes, due to recursion
		// BST<T> current = this;
		if (this.datum.compareTo(datum) > 0)
		{
			if (left == null)
			{
				// create a new node, insert, exit
				BST<T> leftNode = new BST<T>(datum);
				setLeft(leftNode);
				return;
			}
			// keep going down the tree
			else
			{
				left.insert(datum);
			}
		}
		else
		{
			if (right == null)
			{
				BST<T> rightNode = new BST<T>(datum);
				setRight(rightNode);
				return;
			}
			else
			{
				right.insert(datum);
			}
		}
	}
	
	// iterative (using isDone)
	public void insert2 (T datum)
	{
		
		// keep a variable of the current datum we are comparing the input to
		BST<T> current = this;
		boolean isDone = false;
		
		// if true, datum must be on the left
		// if left side is null, insert
		// if not, continue
		while (isDone ==  false) {
			if (current.getDatum().compareTo(datum) > 0) {
				if (current.getLeft() == null) {
					// node is type BST<T>, datum is type T
					// create a node to insert
					BST<T> leftNode = new BST<T>(datum);
					current.setLeft(leftNode);
					isDone = true;
				}
				else {					
					current = current.getLeft();
				}	
			}
			else {
				if (current.getRight() == null) {
					BST<T> rightNode = new BST<T>(datum);
					current.setRight(rightNode);
					isDone = true;
				}
				else {
					current = current.getRight();
				}
			}
		}

	}
	
	public int countNodes()
	{
		int counter = 1;
		if (left == null && right == null)
		{
			counter += 0;
		}
		else if (right == null)
		{
			counter += left.countNodes();
		}
		else if (left == null)
		{
			counter += right.countNodes();
		}
		else
		{
			counter += left.countNodes() + right.countNodes();
		}
		return counter;
	}
	
	// change to in order (left, root, right)
	// substitute for printTree (since it is called when print is called)
	public String inOrder() {
		String s = "";
		if (left != null)
			s = s + left.inOrder();
		s = s + datum + ", ";
		if (right != null)
			s = s + right.inOrder();
		return s;
	}
	
	public void printTree()
	{
		System.out.print(inOrder());
//		if (left == null && right == null)
//		{
//			System.out.println(datum);
//		}
//		else if (right == null)
//		{
//			System.out.print(left + ", ");
//			System.out.println(datum);
//		}
//		else if (left == null)
//		{
//			System.out.print(datum + ", ");
//			System.out.println(right);
//		}
//		else
//		{
//			System.out.print(left);
//			System.out.print(datum + ", ");
//			System.out.println(right);
//		}
	}
}