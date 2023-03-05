package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int numfs [] = {3,2,11,4,6,7};
		int numss [] = {1,2,8,4,9,7};
		
		System.out.println("The intersecting values among both sets are ");
		for (int i = 0; i < numfs.length; i++) {
			for (int j = 0; j < numss.length; j++) {
				if (numfs[i]==numss[j]) {
					System.out.println(numfs[i]);
				}
					
			}
			
		}

	}

}
