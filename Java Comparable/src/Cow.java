
public class Cow implements Comparable<Cow> {
	
	int weight;
	String name;

	public Cow()
	{
		weight = 1800;
		name = "Anonymous Cow";
	}
	
	public Cow(int weight2, String name2)
	{
		this.weight = weight2;
		this.name = name2;
	}
	
	public String toString()
	{
		return name;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public int compareTo(Cow compareCow)
	{
		return this.getWeight() - compareCow.getWeight();
	}

}
