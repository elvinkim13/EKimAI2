import java.util.Scanner;
public class Exercise3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("type two nums");
		int x = in.nextInt();
		int temp = x;
		int y = in.nextInt();
		for(int i=1; i<y;i++){
			x = temp*x;
		}
		System.out.print(x);
	}
}

		