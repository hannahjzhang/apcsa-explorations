import java.util.*;
	
public class Primes {
	
	ArrayList<Integer> primes;
	
	public Primes(int n) 
	{
		primes = new ArrayList<Integer>();
	   	int i = 0;
	   	int p = 2;
	   	while(i < n)
	   	{
	   		if(primed(p) == true)
	   		{
	   			primes.add(p);
	   			i++;
	   		}
	   		p++;
	   	}
	   	primes = reverseList(primes);
	}
	    
	    public ArrayList<Integer> reverseList(ArrayList<Integer> stuff)
	    {
	   	 	ArrayList<Integer> x = new ArrayList<Integer>();
	   	 	for(int i = stuff.size() - 1; i >= 0; i--) 
	   	 	{
	   	 		x.add(stuff.get(i));
	   	 	}
	   	 return x;
	    }
	    
	    public boolean primed(int n) 
	    {
	   	 for(int i = 2; i <= Math.sqrt(n); i++) 
	   	 {
	   		 if(n%i == 0) 
	   		 {
	   			 return false;
	   		 }
	   	 }
	   	 return true;
	    }
	    
	    public boolean isPrime(int n) {
	   	 if(n > primes.get(0)) {
	   		 for(int i=n; i>primes.get(0); i--) {
	   			 if(primed(n) == true) {
	   				 primes.add(n);
	   			 }
	   		 }
	   		 if(primes.get(0) == n) {
	   			 return true;
	   		 }
	   		 else {
	   			 return false;
	   		 }
	   	 }
	   	 else {
	   		 if (primes.contains(n) == true) {
	   			 return true;
	   		 }
	   		 else {
	   			 return false;
	   		 }
	   	 }
	    }
	   	 
	    
	}
