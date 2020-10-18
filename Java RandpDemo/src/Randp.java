import java.util.*;
import java.lang.*;
import java.util.Random;

public class Randp {
    private int[] nums;
    private int numsLeft;
	
    public Randp(int n) {
        initNums(n);
        numsLeft = n;
        
    }
	
    // create an array of numbers that has 1 to n
    private void initNums(int n) {
        nums = new int[n];
    	for (int i = 1; i <= n; i++)
        {
        	nums[i-1] = i;
        }
    }
	
    // finds the next unique random number
    public int nextInt() {
        // Math.random() should never be called more than once
        // when this method is called.  Recursion is not allowed.
    	
    	// create a random number in the range
    	int randomNum = (int) (numsLeft * Math.random());
    	// if there are no nums left, return zero
    	//int actual = nums[randomNum];
    	if (numsLeft == 0)
    	{
    		return 0;
    	}
    	// if there are more, rearrange
    	else
    	{
    		swap(nums, randomNum, numsLeft - 1);
    		numsLeft --;
    	}
    	// once done, return the random number changed
    	//return actual;
    	
    	return nums[numsLeft];
        
    }
    
    // swaps the random index num with the last, changes numsLeft
    public void swap(int[] arr, int a, int b)
    {
    	int temp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = temp;
    }

}
