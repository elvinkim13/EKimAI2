import java.util.Scanner;
public class Challenge3{
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
		double mean = total/lis.length;
		double sum = 0;
		for (int i = 0; i < num; i++){
			sum += (lis[i]-mean)*(lis[i]-mean);
		}
		System.out.println(Math.sqrt(sum/(lis.length-1)));
	}
}

			
			