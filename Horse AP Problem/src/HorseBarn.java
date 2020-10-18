
public class HorseBarn {
	
	
	private Horse[] spaces;
	
	public HorseBarn(int size)
	{
		spaces = new Horse[size];
	}
	
	public int findHorseSpace(String name)
	{
		for (int i = 0; i < spaces.length; i++)
		{
			// == checks to see if both objects have the same memory location
			// .equals() checks if the content is the same
			if (spaces[i] != null && spaces[i].getName().equals(name))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void consolidate()
	{
		for (int i = 0; i < spaces.length; i++)
		{
			if (spaces[i] == null)
			{
				for (int j = i + 1; j < spaces.length; j++)
				{
					if (spaces[j] != null)
					{
						spaces[i] = spaces[j];
						// must set to null afterwards so that continue to shift over
						spaces[j] = null;
						break;
					}
				}
			}	

		}
	}
	
	public void set(Horse name, int index)
	{
		spaces[index] = name;
	}
	
	public void print()
	{
		for(int i = 0; i < spaces.length; i++)
		{
			if (spaces[i] == null)
			{
				System.out.print("null" + ", ");
			}
			else
			{
				System.out.print(spaces[i].getName() + ", ");
			}
		}
		System.out.println();
	}

}
