package assignment2.day2;

public class Intersection {
public static void main(String[] args) {
		
		int[] array1= {19,10,20,19,100,60,35};

		int[] array2= {19,10,20,19,20,56,32};

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {

				

				if(array1[i]==array2[j]) {



					System.out.println(array1[i]);

				}

			}

		}

	}

}

