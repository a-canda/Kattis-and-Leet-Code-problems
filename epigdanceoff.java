import java.util.*;


public class epigdanceoff {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[m];
		for (int x = 0; x < n; x++) {
			char[] index = sc.next().toCharArray();
			for (int y = 0; y < m; y++) {
				if (index[y] == '_')
					arr[y]++;
			}
		}
		int counter = 0;
		for (int x : arr)
			if (x == n)
				counter++;
		System.out.println(counter + 1);
	}
}
