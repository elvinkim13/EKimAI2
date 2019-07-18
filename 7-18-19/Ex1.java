import java.util.Scanner;
public class Ex1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string");
		String s = in.nextLine();
		char[] clis = new char[s.length()];
		for(int i = 0; i < s.length(); i++){
			clis[i] = s.charAt(i);
		}
		printList(clis);
	}
	public static void printList(char[] clis){
		System.out.print("[");
		for (int i = 0; i < clis.length; i++){
			System.out.print("'");
			System.out.print(clis[i]);
			System.out.print("'");
			if (i!=clis.length-1){
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
		
	}		
}
