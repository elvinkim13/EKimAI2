import java.util.Scanner;
public class Challenge2{
	public static void main(String args[]){
		double total = 0.0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = in.nextInt();
		double[] lis = new double[num];
		for (int i = 0; i < num; i++){
			System.out.println("Enter a double: ");
			lis[i] = in.nextDouble();
			total += lis[i];
		}
		for (int i = 0; i < num; i++){
			System.out.print(lis[i]);
			System.out.print(" : ");
			System.out.print(100*lis[i]/total);
			System.out.println("%");
		}
	}
}