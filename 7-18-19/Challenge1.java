public class Challenge1{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		System.out.print(idxOf(a,1));
	}
	public static int idxOf(int[] numbers, int number){
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] == number){
				return i;
			}
		}
		return -1;
	}
}