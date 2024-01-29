package week03Package;

public class week03homework2 {

		public static void newArray(String word1, String word2, String word3, String[] arr) {
		
		String[] newArr = {word1, word2, word3};
		
	    String[] newNewArr = new String[arr.length + newArr.length];
	    
	    for(int i = 0; i < arr.length; i++) {
	        newNewArr[i] = arr[i];
		    System.out.println(newNewArr[i]);
	        }
		
		for(int j = 0; j < newArr.length ; j++) {
	        newNewArr[arr.length+j] = newArr[j];
		    System.out.println(newNewArr[arr.length+j]);

	    }
	   	}

	
	public static void main(String[] args) {

		String word1 = "hello";
		String word2 = "hi";
		String word3 = "hola";
		String[] arr = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
		newArray(word1, word2, word3, arr);
	}

}
