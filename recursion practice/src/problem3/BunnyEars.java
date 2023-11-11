package problem3;

public class BunnyEars {

	public static void main(String[] args) {
		
		int answer = bunnies(0);
		System.out.println(answer);
		
		int answer2 = bunnies(1);
		System.out.println(answer2);
		
		int answer3 = bunnies(2);
		System.out.println(answer3);
		
		int answer4 = bunnies(10);
		System.out.println(answer4);		

	}

public static int bunnies(int n) {
	int c = 0;
	if (n == 0) {
		return c = 0;
	}
	else {
		c = 2;
		return c + bunnies(n - 1);
	}
}
	
}
