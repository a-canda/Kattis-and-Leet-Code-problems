import java.util.*;
public class ArmyStrength {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for(int i = 0; i < TC; i++) {
			
			int g = sc.nextInt();
			int m = sc.nextInt();
			
			int gStr = 0;
			int mStr = 0;
			int tempStr = 0;
			
			for (int x = 0; x < g; x++) {
				tempStr = sc.nextInt();
				if(tempStr > gStr)
					gStr = tempStr;
			}
			
			for (int y = 0; y < m; y++) {
				tempStr = sc.nextInt();
				if(tempStr > mStr)
					mStr = tempStr;
			}
			
			if (mStr > gStr)
				System.out.println("MechaGodzilla");
			else
				System.out.println("Godzilla");
			
		}
		
		
		sc.close();
	}
}
