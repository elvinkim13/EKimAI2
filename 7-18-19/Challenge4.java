import java.util.Scanner;
import java.util.Arrays;
public class Challenge4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] a = new int[0];
		int[] b = new int[0];
		int num = 0;
		do{
			System.out.println("Enter an integer: ");
			num = in.nextInt();
			b = new int[a.length+1];
			for(int i = 1; i < a.length+1; i++){
				b[i] = a[i-1];
			}
			b[0] = num;
			a = b;
		}while(num != -1);
		System.out.println(Arrays.toString(a));
	}
			
}
