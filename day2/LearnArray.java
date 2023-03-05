package week1.day2;

public class LearnArray {

	public static void main(String[] args) {
//datatype    variablename = {values}
		int[] scores = {90,95,98,100,92};
//to find the length of an array	
		int len = scores.length;
		
	System.out.println("The length of the array is " + len);
	
// to retrieve a single value
	System.out.println(scores[3]);

// to print all data in array
	for (int i = 0; i < len; i++) {
		System.out.println(scores[i]);
		
	}
	
		
		}

	}


