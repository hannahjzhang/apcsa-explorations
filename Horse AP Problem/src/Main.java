
public class Main {

	public static void main(String[] args) {
		
		HorseBarn barn1 = new HorseBarn(7);
		Horse h0 = new Horse("Trigger");
		Horse h2 = new Horse("Silver");
		Horse h5 = new Horse("Patches");
		Horse h6 = new Horse("Duke");
		
		barn1.set(h0, 0);
		barn1.set(h2, 2);
		barn1.set(h5, 5);
		barn1.set(h6, 6);
		
		barn1.print();
		
		barn1.consolidate();
		barn1.print();

	}

}
