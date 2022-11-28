import java.util.*;

class Program {
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		for (int i = 0; i < array.size(); i++) {

			for (int k = 0; k < sequence.size(); k++) {
				if (array.get(i) == sequence.get(k)) {
					return true;
				}
			}
		}
		return false;
	}
}
