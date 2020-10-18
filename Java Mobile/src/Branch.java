
public class Branch {
	
	// instance variables
	private double length;
	private Structure struct;
	
	// constructor
	public Branch(double length, Structure struct) {
		this.length = length;
		this.struct = struct;
	}
	
	// write getStructure in branch because a branch has a length and structure
	// these methods are important, will be called in mobile and weight
	// kind of like helper functions
	public double getLength() {
		return length;
	}
	
	public Structure getStructure() {
		return struct;
	}
	
	// structure can be a weight or another mobile --> loop
	public double torque() {
		return length * struct.getWeight();
	}
}