import java.util.*;

public class carrots {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // contestants
		int p = sc.nextInt(); // problems solved
		
		String description;
		while (n-- > 0)
			description = sc.nextLine();
		
		System.out.println(p);
		sc.close();
	}

}
