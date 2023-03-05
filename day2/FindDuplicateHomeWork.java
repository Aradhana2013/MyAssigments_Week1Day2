package week1.day2;

import java.util.Arrays;

public class FindDuplicateHomeWork {

	public static void main(String[] args) {
		int mypoormarksalways[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		int len = mypoormarksalways.length;
		Arrays.sort(mypoormarksalways);
		System.out.println("The duplicate values are ");
		
		for (int i = 0; i < len-1; i++) {
			if (mypoormarksalways[i]==mypoormarksalways[i+1]) {
				System.out.println(mypoormarksalways[i]);
			}
		}

	}

}
