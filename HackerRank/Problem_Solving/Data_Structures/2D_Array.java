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

class Result {

	/*
	 * Complete the 'hourglassSum' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int hourglassSum(List<List<Integer>> arr) {
		// Write your code here

		int currentTotal = 0;
		int largestTotal = Integer.MIN_VALUE;

		for (int r = 0; r <= 3; r++) {
			for (int c = 0; c <= 3; c++) {

				currentTotal = arr.get(r).get(c) + arr.get(r).get(c + 1) + arr.get(r).get(c + 2)
						+ arr.get(r + 1).get(c + 1) + arr.get(r + 2).get(c) + arr.get(r + 2).get(c + 1)
						+ arr.get(r + 2).get(c + 2);

				if (currentTotal > largestTotal) {
					largestTotal = currentTotal;
				}
			}
		}

		return largestTotal;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(
						Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt)
								.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result.hourglassSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
