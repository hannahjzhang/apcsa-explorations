import java.util.*;

public class Main {
	
	public static void main(String[] args) {
	    Cow[] cows = { new Cow(2000, "Hulk"),
	                   new Cow(),
	                   new Cow(1600, "Bessie"),
	                   new Cow(1700, "Moohead"),
	                   new Cow(),
	                   new Cow(1900, "Big Time Jones") };

	    printArray(cows);
	    System.out.println();
	    // when running sort, always looks for compareTo
	    Arrays.sort(cows);
	    printArray(cows);
	}
	
	public static void printArray(Cow[] cows)
	{
		// for each Cow in the array cows
		for(Cow i : cows)
		{
			System.out.print(i.toString() + ", ");
		}
	}

}
