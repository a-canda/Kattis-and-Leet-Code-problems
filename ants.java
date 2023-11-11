import java.util.*;

public class ants {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		while(cases-- > 0) {
			int l = sc.nextInt(); // length of the pole in cm
			int n = sc.nextInt(); // number of ants residing on the pole
			int min = 0;
			
			int[] ants = new int[n];
			e4
			for (int i = 0; i < n; i++) {
				ants[i] = sc.nextInt();
				min = Math.max(Math.min(ants[i], l - ants[i]), min);
			}
			
			Arrays.sort(ants);
			int[] max = {ants[0], ants[n - 1], l - ants[0], l - ants[n - 1]};
			
			Arrays.sort(max);
			System.out.println(min + " " + max[3]);
		}
		
	}
}
