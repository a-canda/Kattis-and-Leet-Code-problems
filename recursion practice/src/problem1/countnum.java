package problem1;

public class countnum {

	public static void main(String[] args) {
		
		int answer = count(717);
		System.out.println(answer);
		
		int answer2 = count(787770097);
		System.out.println(answer2);
		
		int answer3 = count(123);
		System.out.println(answer3);

	}

	
public static int count(int n) {
	int c = 0;
	if (7 > n) {
		return 0;
	}
	else {
		if(7==n % 10)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return c + count(n / 10);
	}
}
	
}
