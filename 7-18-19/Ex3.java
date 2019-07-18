import java.util.Scanner;
public class Ex3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++){
			arr[i]+=1;
			System.out.print("Enter an integer: ");
			int x = in.nextInt();
			if (x%2==0){
				arr[i]*=2;
			}
			if (x%3==0){
				arr[i]*=3;
			}
		}
		System.out.println(arr);
	}
}