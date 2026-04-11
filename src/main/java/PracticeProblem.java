/*
* File: Lesson 4.1: While Loops and accumulators
* Author: Leo
* Date Created: April 10, 2026
* Date Last Modified: April 10, 2026
*/
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String seriesInclusive(int num) {
		//Write question 1 code here
		if (num < 1) {
			return "";
		}

		String result = "";
		int count = 1;
		while (count <= num) {
			result = result + count;
			if (count < num) {
				result = result + " ";
			}
		count = count + 1;
		}
		return result;
	}

	public static String seriesExclusive(int num) {
		//Write question 2 code here
		if (num < 1) {
			return "";
		}

		String result = "0";
		int count = 1;
		while (count < num) {
			result = result + " " + count;
			count = count + 1;
		}
			return result;
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
