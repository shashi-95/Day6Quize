import java.util.Scanner;
import java.lang.Math;
public class Distance {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1");
		int x1 = sc.nextInt();
		System.out.println("Enter Y1");
		int y1 = sc.nextInt();
		System.out.println("Enter X2");
		int x2 = sc.nextInt();
		System.out.println("Enter Y2");
		int y2 = sc.nextInt();
		double res = Math.sqrt((y2-y1)^2+(x2-x1)^2);
		System.out.println(res);
	}

}
