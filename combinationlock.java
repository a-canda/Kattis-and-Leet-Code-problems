import java.io.*;
import java.util.*;

public class combinationlock {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int degrees = 720;
			int first = sc.nextInt();
			int second = sc.nextInt();
			int third = sc.nextInt();
			int fourth = sc.nextInt();
			if ((first == 0) && (second == 0) && (third == 0) && (fourth == 0)) {
				break;
			}
			
			if(second > first)
				degrees += ((40 - second) + first) * 9;
			else
				degrees += Math.abs(first - second) * 9;
			degrees += 360;
			
			if(third < second)
				degrees += ((40 - second) + third) * 9;
			else
				degrees += Math.abs(third - second) * 9;
			
			if(fourth > third)
				degrees += ((40 - fourth) + third) * 9;
			else
				degrees += Math.abs(fourth - third) * 9;
			System.out.println(degrees);
			
		}
	
			
		sc.close();
		
	}
}