package assignment2.day2;

public class FindType {
	public static void main(String[] args) {
		String test = "There are 26 alphabets in English";

		int  letter = 0, space = 0, num = 0;

char[] A =test.toCharArray();

for (int i = 0; i < A.length; i++) {

	if(Character.isDigit(A[i])) {

		num =num+1;



	}

	else if(Character.isAlphabetic(A[i])){

		letter=letter+1;

	}

	

	

}

	System.out.println("num :" + num);

	System.out.println("letter :" + letter);

	System.out.println("space : " + space);

	

		

	}

}
