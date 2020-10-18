
public class Main {

    public static void main(String[] args) {
   	 
   	 
   	 
   	 Primes primeList = new Primes(50);
   	 System.out.println(primeList.primes);
   	 
   	 System.out.println(primeList.isPrime(4));
   	 System.out.println(isBrilliant(20));

    }
    
    public static boolean isPrime(int n) {
   	 for(int i = 2; i <= Math.sqrt(n) +.01; i++) {
   		 if(n%i == 0) {
   			 return false;
   		 }
   	 }
   	 return true;
    }
    
    public static boolean isBrilliant(int n) {
   	 Primes primeList2 = new Primes(n);
   	 for(int i = 0; i< primeList2.primes.size(); i++) {
   		 for(int l = 0; l< primeList2.primes.size(); l++) {
   			 if (primeList2.primes.get(l) * primeList2.primes.get(i) == n && digits(primeList2.primes.get(l), primeList2.primes.get(i)) == true) {
   				 return true;
   			 }
   		 }
   	 }
   	 return false;
    }
    
    public static boolean digits(int a, int b) {
   	 String A = Integer.toString(a);
   	 String B = Integer.toString(b);
   	 if (A.length() == B.length()) {
   		 return true;
   	 }
   	 else {
   		 return false;
   	 }
    }

}