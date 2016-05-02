package com.sundance.algorithm.number;

public class Bubble {

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 0, 23, 12, 13, 14, 34,  1 };

		printNumbers(input);
		
		bubbleSort(input);

	}

	private static void bubbleSort(int[] input) {

		int tmp;
		for(int j = input.length - 1 ; j > 0; j--) {
			boolean swap = false;
			for(int i = 0; i < j; i++) {
				if(input[i] > input[i + 1]) {
					tmp = input[i];
					input[i] = input[i+1];
					input[i+1] = tmp;
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
			
			printNumbers(input);
		}
	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

}
