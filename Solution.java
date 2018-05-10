import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberOfTestCases = reader.nextInt();
		int[] allResults = new int[numberOfTestCases];

		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfBalls = reader.nextInt();
			int requestedPosition = reader.nextInt();
			int result = getIndex(numberOfBalls, requestedPosition);
			allResults[i] = result;
		}

		for (int i = 0; i < numberOfTestCases; i++) {
			System.out.println(allResults[i]);
		}
	}

	public static int getIndex(int numberOfBalls, int requestedPosition) {
		int position;

		int lastIndex = numberOfBalls - 1;

		if (requestedPosition >= lastIndex / 2) {
			position = (lastIndex - requestedPosition) * 2;
		} else {
			position = requestedPosition * 2 + 1;
		}
		return position;
	}
}
