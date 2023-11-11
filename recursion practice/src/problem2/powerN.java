package problem2;

public class powerN {

	public static void main(String[] args) {
		
		int answer = powerNum(3,1);
		System.out.println(answer);
		
		int answer2 = powerNum(3,2);
		System.out.println(answer2);
		
		int answer3 = powerNum(3,3);
		System.out.println(answer3);

	}
	
public static int powerNum(int base, int n) {
	if (n == 1)
		return base;
	else
	{
		return base*powerNum(base, n - 1);
	}
}

}
