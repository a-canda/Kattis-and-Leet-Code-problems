import java.util.*;

public class jollyjumpers {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer tokens;
		
		int numberOfInputs;
		
		while (sc.hasNext()) {
			tokens = new StringTokenizer(sc.nextLine());
			numberOfInputs = Integer.parseInt(tokens.nextToken());
			int[] numbers = new int[numberOfInputs];
			
			for (int i = 0; i < numberOfInputs; i++) {
				numbers[i] = Integer.parseInt(tokens.nextToken());
			}
			System.out.println(isJolly(numbers));
		}
		sc.close();
	}

		
		private static String isJolly(int[] numbers) {
			List list = new ArrayList();
			for (int i = 0; i < numbers.length - 1; i++) {
				int result = Math.abs(numbers[i] - numbers[i + 1]);
				
				if (result == 0) {
					return "Not jolly";
				}
				
				if (result >= numbers.length) {
					return "Not jolly";
				}
				
				if (list.contains(result)) {
					return "Not jolly";
				}
				
				list.add(result);
			}
			return "Jolly";
		}
			
	}


