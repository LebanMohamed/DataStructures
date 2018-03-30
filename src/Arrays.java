 public class Arrays {

	private static int countLessThan(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] <= n)
				count++;
		return count;
	}

	private static int[] destructivelyMultiply(int[] arr, int n1, int n2) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < n1)
				arr[i] = arr[i] * n2;
		return arr;
	}

	private static int[] constructivelyMultiply(int[] arr, int n1, int n2) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < n1)
				newArr[i] = arr[i] * n2;
			else
				newArr[i] = arr[i];
		return newArr;
	}

	private static int findClosePos(int[] arr, int n) {
		int found = 0;
		for (int i = 0; i < arr.length; i++)
			if (Math.abs(arr[i]) == n)
				found = i;
		return found;
	}

	private static int[] splitArr(int[] arr, int n1, int n2) {
		int foundPosn1 = 0;
		int foundPosn2 = 0;

		for (int i = 0; i < arr.length; i++)
			if (arr[i] == n1) {
				foundPosn1 = i;
				break;
			}

		for (int i = 0; i < arr.length; i++)
			if (arr[i] == n2) {
				foundPosn2 = i;
				break;
			}

		int newArr[] = new int[(foundPosn2 - foundPosn1) + 1];
		for (int i = 0; i < newArr.length; i++)
			newArr[i] = arr[foundPosn1 + i];
		return newArr;
	}

	private static int[] splitArrGreaterThan(int[] arr, int n) {
		int count = 0;

		for (int i = 0; i < arr.length; i++)
			if (arr[i] >= n)
				count++;

		int newArr[] = new int[count];
		for (int i = 0, j = 0; i < arr.length; i++)
			if (arr[i] >= n) {
				newArr[j] = arr[i];
				j++;
			}
		return newArr;
	}

	private static boolean checkOrder(int[] arr) {
		for (int i = 1; i < arr.length; i++)
			if (arr[i - 1] > arr[i])
				return false;
		return true;
	}

	private static boolean arrayMatch(int[] arr1, int[] arr2) {

		boolean[] flag = new boolean[arr2.length];

		for (int i = 0; i < arr1.length; i++)
			for (int j = 0; j < arr2.length; j++)
				if (arr1[i] == arr2[j])
					flag[j] = true;

		for (int i = 0; i < flag.length; i++)
			if (flag[i] == false)
				return false;
		return true;
	}

	private static int countSameBoth(int[] arr1, int[] arr2) {
		int count = 0;

		for (int i = 0; i < arr1.length; i++)
			for (int j = 0; j < arr2.length; j++)
				if (arr1[i] == arr2[j])
					count++;
		return count;
	}
	
    private static int rec(int[] arr, int counter, int n, int i) {
        if (n == 0)
            return counter;
        else if (arr[i] == 4)
            return rec(arr, counter + 1, n - 1, i + 1);
        else
            return rec(arr, counter, n - 1, i + 1);
    }

}
