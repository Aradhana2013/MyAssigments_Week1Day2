package week1.day2;

import java.util.Arrays;

public class ArrayWithAnotherExample {

	public static void main(String[] args) {
		String subjects[] = {"Maths", "Computer Science", "Biology", "Physics", "Chemistry", "Tamil", "English"};


		int len = subjects.length;
		System.out.println(len);
		Arrays.sort(subjects);

		
		System.out.println("The subject names in alphabetical descending is ");
		for (int i = len-1; i >= 0 ; i--) {
			System.out.println(subjects[i]);
		}
		System.out.println("The subject names in alphabetical ascending is ");
		for (int i = 0; i < len - 1 ; i++) {
			System.out.println(subjects[i]);
		}

	}

}
