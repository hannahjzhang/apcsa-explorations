
public class Wombat extends Animal {

	public Wombat()
	{
		this(1800, "Anonymous Wombat");
	}
	
	public Wombat (int weight, String name)
	{
		super(weight, name);
	}
	
	// by creating a separate eat method, it does not implement the eat method inherited from Animal
	// this is why all animals gain weight except for wombat
	// prints it out three times because there are 3 wombats
	public void eat(int addedWeight)
	{
		System.out.println("Wombats don't gain weight when they eat!");
	}

}
