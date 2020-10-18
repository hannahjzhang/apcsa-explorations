// If you make Structure an interface, Weight must implement it.

public class Weight implements Structure {
	
	// instance variable
	private double weight;

	// constructor
    public Weight(double weight) {
		this.weight = weight;
    }
    
    // after using in mobile, it comes here at the end to return the weight
    public double getWeight()
    {
    	return weight;
    }
    
    // a weight is never balanced
    public boolean isBalanced()
    {
    	return false;
    }
}