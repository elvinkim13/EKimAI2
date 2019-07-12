import java.util.Scanner;
public class Exercise6{
	public static void main(String [] args){
	Scanner in = new Scanner(System.in);
	int one = in.nextInt();
	int two = in.nextInt();
	int three = in.nextInt();
	int four = in.nextInt();
	int five = in.nextInt();
	int six = in.nextInt();
	int avg = (one+two+three+four+five+six)/6;
	System.out.print(avg);
	}
}