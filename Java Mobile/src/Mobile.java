// If you make Structure an interface, Mobile must implement it.

public class Mobile implements Structure {	
	
	// instance variable
	private Branch left;
	private Branch right;
	
	// constructor
	public Mobile(Branch left, Branch right) {
		this.left = left;
		this.right = right;
	}
	
	// keeps on getting weight as long as the next value is a structure
	// once it goes to weight, refers to the method in weight class
	public double getWeight()
	{
		Structure leftSide = left.getStructure();
		Structure rightSide = right.getStructure();
		return leftSide.getWeight() + rightSide.getWeight();
	}
	
	public boolean isBalanced()
	{
		if(left.torque() == right.torque())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
