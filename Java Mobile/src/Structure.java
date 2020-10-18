// in the introduction, the Comparable interface was already made
// now we are making the interface ourselves

public interface Structure {
	
	// any class that implements this interface must have these two methods
	// every time structure is called, it must run these two
	public double getWeight();
	public boolean isBalanced();

}