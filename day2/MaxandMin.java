package week1.day2;

import java.util.Arrays;

public class MaxandMin {

	public static void main(String[] args) {
		
		int scores[] = {98,100,999,50,99};
		Arrays.sort(scores);
		System.out.println("The Maximum value is " + scores [scores.length - 1]);
		System.out.println("The Minimum value is " + scores[0]);
		

	}

}
