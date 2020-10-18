
public class Cow extends Animal {

	// when these are called, it passes it to the super class
	// different than the previous one we wrote because this is a subclass
	public Cow()
	{
		this(1800, "Anonymous Cow");
	}
	
	public Cow (int weight, String name)
	{
		super(weight, name);
	}	

}
