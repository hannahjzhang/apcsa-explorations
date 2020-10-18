
public class Main {

	public static void main(String[] args) {
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.insert(7);
		bsti.insert(19);
		bsti.insert2(14);
		bsti.insert(2);
		bsti.insert(1);
		// If printed in order, the below line should produce 7, 12, 19
		System.out.println(bsti);
		bsti.printTree();
		System.out.println(bsti.depth());
		System.out.println(bsti.countNodes());
		System.out.println(sumTree(bsti));
		
		BST<String> bsts = new BST<String>("apple");
		bsts.insert("watermelon");
		bsts.insert("orange");
		bsts.insert("lemon");
		System.out.println(bsts);
		bsts.printTree();
		
		
	}
	
	public static int sumTree(BST<Integer> bsti)
	{
		BST<Integer> r = bsti.getRight();
		BST<Integer> l = bsti.getLeft();
		
		int sum = 0;
		if (l == null && r == null)
		{
			sum += bsti.getDatum();
		}
		else if (r == null)
		{
			sum += sumTree(l) + bsti.getDatum();
		}
		else if (l == null)
		{
			sum += sumTree(r) + bsti.getDatum();
		}
		else
		{
			sum += sumTree(l) + bsti.getDatum() + sumTree(r);
		}
		return sum;
	}

}

// to do
/**
 * make a bst<string> and verify its printTree method works
 * write a method countNodes() in your BST class
 * write a method sumTree that takes a BST<Integer as its input and returns the sum of its data
 * **/
