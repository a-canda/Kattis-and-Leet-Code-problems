package hw1;

public class Main {

	public static void main(String[] args) {
		int answer = recursion(25);
	    System.out.println(answer);
	    
	    int answer2 = recursion(50);
	    System.out.println(answer2);
	    
	    int answer3 = recursion(67);
	    System.out.println(answer3);
	    
	    int answer4 = recursion(100);
	    System.out.println(answer4);
	}

public static int recursion(int n) {
	// Base case
	if (n > 0)
	{
		// Recursion step
		return n + recursion(n-1);
	}
	else
	{
		return 0;
	}
}
}