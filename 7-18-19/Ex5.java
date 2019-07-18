public class Ex5{
	public static void main(String args[]){
		int[] arr = {1,2,3,4};
		swap(arr,1,3);
		for(int i:arr){
			System.out.println(i);
		}
	}
	public static void swap(int[] arr,int ind1,int ind2){
		int temp = arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
	}
}