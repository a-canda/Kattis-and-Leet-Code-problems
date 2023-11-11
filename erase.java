import java.util.*;

public class erase {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		boolean success = true;
		
		int N = sc.nextInt();
		String line2 = sc.next();
		String line3 = sc.next();
		
	
		if (N % 2 == 0) // || line2.equals(line3)) 
			success = line2.equals(line3);
			//success = true;
	
		else
		{
			for (int i = 0; i < line2.length(); i++) {
				if((success && line2.charAt(i) != line3.charAt(i) || !success && line2.charAt(i) == line3.charAt(i)))
						success = false;
				//if (line2.charAt(i) == line3.charAt(i))
					//success = false;
			}
		}
		
		
		//boolean same = N % 2 == 0;
		
		
		
		if (success) 
			System.out.println("Deletion succeeded");
		else 
			System.out.println("Deletion failed");
		
		sc.close();
	}

}
