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
	 * Complete the 'matchingStrings' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts following parameters:
	 * 1. STRING_ARRAY stringList
	 * 2. STRING_ARRAY queries
	 */

	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
		// Write your code here
		List<Integer> newArray = new ArrayList<Integer>();

		for (int i = 0; i < queries.size(); i++) {
			int counter = 0;
			for (int k = 0; k < stringList.size(); k++) {

				System.out.println(stringList.get(k));
				System.out.println(queries.get(i));
				System.out.println("i:" + i);
				System.out.println("k:" + k);

				if ((stringList.get(k)).equals(queries.get(i))) {

					counter++;
					System.out.println("counter");
					System.out.println(counter);
				}

			}
			newArray.add(counter);
		}
		return newArray;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> stringList = IntStream.range(0, stringListCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.collect(toList());

		int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.collect(toList());

		List<Integer> res = Result.matchingStrings(stringList, queries);

		bufferedWriter.write(
				res.stream()
						.map(Object::toString)
						.collect(joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
