package assignment2.day2;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] data = {32,56,12,500,763,37,46,15,62};

		Arrays.sort(data);

		int l=data.length;

		System.out.println(data[l-2]);
	}

}
