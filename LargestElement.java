import java.util.*;
public class LargestElement {
	public static void main(String args[]) {
		
		 Scanner  sc = new Scanner(System.in);
		 //int len = sc.nextInt();
		int array[] = {10, 30, 1, 4,5};
		int len = array.length;
		int mx = -100000;
		for(int i=0; i<len; i++) {
			if(array[i]>mx)
				mx = array[i];
		}
	System.out.println(mx);
		
		
		
		
	}

}
