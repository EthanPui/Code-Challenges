// From HackerRank.com 

// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
// Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.text.DecimalFormat;

class Result {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		double counterPositive = 0;
		int counterNegative = 0;
		int counterZero = 0;
		double d = arr.size();

		DecimalFormat df = new DecimalFormat("#.######"); // 6 Decimal places

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				counterPositive++;
			}
			if (arr.get(i) < 0) {
				counterNegative++;
			}
			if (arr.get(i) == 0) {
				counterZero++;
			}
		}
		// System.out.println(counterPositive);
		// System.out.println(counterNegative);
		// System.out.println(counterZero);
		// System.out.println(arr.size());

		// ratio of positive
		double roundedPositive = (counterPositive / d);
		System.out.println(df.format(roundedPositive));

		// ratio of negative
		double roundedNegative = (counterNegative / d);
		System.out.println(df.format(roundedNegative));

		// ratio of zero
		double roundedZero = (counterZero / d);
		System.out.println(df.format(roundedZero));

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}
