import java.util.*;
public class ReverseString {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		System.out.println(len);
		char [] ch = str.toCharArray();
		
		for(int i=len-1; i>=0; i--)
			System.out.print(ch[i]);
	}
	  
}
