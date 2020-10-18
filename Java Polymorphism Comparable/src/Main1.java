import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		Animal[] animals = { new Horse(2000, "Hulk"),
				new Wombat(),
                new Wombat(1600, "Bessie"),
                new Cow(1700, "Moohead"),
                new Wombat(),
                new Wildebeest(1900, "Big Time Jones") };


		printArray(animals);
		for (Animal a : animals) 
		{
			a.eat(200);
		}
		Arrays.sort(animals);
		printArray(animals);

	}
	
	public static void printArray(Animal[] arrayOfAnimals)
	{
		for(Animal i : arrayOfAnimals)
		{
			System.out.print(i.toString() + ":" + i.getWeight() + ", ");
		}
		System.out.println();
	}

}
