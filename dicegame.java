import java.util.*;

public class dicegame {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int Gunnar = 0;
			int Emma = 0;
			
			for (int i = 0; i < 4; i++) {
				Gunnar = Gunnar + sc.nextInt();
			}
			
			for (int i = 0; i < 4; i++) {
				Emma = Emma + sc.nextInt();
			}
			
			if (Gunnar > Emma)
				System.out.println("Gunnar");
			else if (Gunnar < Emma)
				System.out.println("Emma");
			else
				System.out.println("Tie");
		}
		
	}
}
