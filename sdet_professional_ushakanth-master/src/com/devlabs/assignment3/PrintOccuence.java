package com.devlabs.assignment3;

public class PrintOccuence {

	final static int NO_OF_CHARS = 256;

	/*
	 * static void distinctchar(String str) {
	 * 
	 * String str1 = str; int[] count = new int[NO_OF_CHARS];
	 * 
	 * Counter array with frequency of characters int i; for (i = 0; i <
	 * str.length(); i++) if (str.charAt(i) != ' ') count[(int) str.charAt(i)]++;
	 * int n = i;
	 * 
	 * // Print characters having count more than 0 for (i = 0; i < n; i++) if
	 * (count[(int) str.charAt(i)] == 1) { System.out.print(" " + str.charAt(i));
	 * 
	 * }
	 * 
	 * }
	 */

	public static void findoccurence(String str, char ch2) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch2) {
				count++;
			}
		}

		System.out.println(ch2 + "  --> " + count);

	}

	public static void main(String[] args) {

		String str1 = new String("DevLabsAllianceTraining");

		char arr[] = str1.toCharArray();

		// distinctchar(str1);

		// to find unique occurences
		StringBuilder sb = new StringBuilder();
		boolean repeatedChar;
		for (int i = 0; i < arr.length; i++) {

			repeatedChar = false;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeatedChar = true;
					break;
				}
			}

			if (!repeatedChar) {
				sb.append(arr[i]);
			}
		}

		String str2 = new String(sb);
		char arr2[] = str2.toCharArray();
		System.out.println("String : " + str1);
		System.out.println("\nNo.of occurences of characters:  ");
		for (char ch : arr2) {

			findoccurence(str1, ch);

		}

	}

}
