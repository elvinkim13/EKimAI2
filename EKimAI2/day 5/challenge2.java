import java.util.Scanner;
public class challenge2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double min = 10000000000000000000000000000000.0;
		int x = in.nextInt();
		double y = 0.0;
		for (int i = 1; i<=x; i++){
			y = in.nextDouble();
			if (y<min){
				min = y;
			}
		}
		System.out.println(min);
	}
}