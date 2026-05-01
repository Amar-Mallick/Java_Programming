package practice_code;

public class Count_Duplicate_In_Array {

	public static void main(String[] args) {
		int arr[]= {15,20,35,30,20,25};
		int number=20;
		int count=0;
		
		
    for (int i = 0; i < arr.length; i++) {
    	if (arr[i]==number) {
    		 count++;
    		
		}
    	 
			}
    System.out.println("Number " + number + " appears " + count + " times in the array.");
	}

}
