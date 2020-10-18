// in order to use comparable, must write compareTo
public class Animal implements Comparable<Animal>{
	
	// instance variable
	int weight;
	String name;
	
	// constructor (default and inputs)
	public Animal()
	{
		weight = 1800;
		name = "Anonymous Animal";
	}
	
	public Animal(int weight, String name)
	{
		this.weight = weight;
		this.name = name;
	}
	
	// methods to implement in main
	public int getWeight()
	{
		return weight;
	}
	
	// without toString, it returns the place in memory
	public String toString()
	{
		return name;
	}
	
	public void eat(int addedWeight)
	{
		weight = weight + addedWeight;
	}
	
	// in main, sort looks for this method
	// this method compares the first two and sorts, then moves on
	public int compareTo(Animal compareAnimal)
	{
		return this.weight - compareAnimal.getWeight();
	}

}
