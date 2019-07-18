public class Ex4{
	public static void main(String[] args){
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,5};
		boolean x = arrayEquals(a,b);
		System.out.print(x);
	}	
	public static boolean arrayEquals(int[] arr1, int[] arr2){
		if (arr1.length != arr2.length){
			return false;
		}
		for (int i = 0; i < arr1.length; i++){
			if (arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
		
			
	}
}