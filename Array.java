import java.util.*;

public class Array {

    static int[] addPos(int arr[], int pos, int b) {
        if (pos > arr.length || pos < 0) {
            System.err.println("error");
            return arr;
        }

        int[] arr2 = new int[arr.length + 1];

        int i = 0;
        for (; i < arr.length; i++) {
            if (i == pos) {
                arr2[i] = b;
                break;
            } else {
                arr2[i] = arr[i];
            }
        }

        for (int j = i; j < arr.length; j++) {
            arr2[j + 1] = arr[i];
            i++;
        }
        return arr2;
    }

    static int[] removePos(int arr[], int pos) {
        if (pos > arr.length || pos < 0) {
            System.err.println("error");
            return arr;
        }

        int[] arr2 = new int[arr.length - 1];

        int i = 0;
        for (; i < arr.length; i++) {
            if (i == pos) {
                i++;
                break;
            } else {
                arr2[i] = arr[i];
            }
        }

        for (int j = i; j < arr.length; j++) {
            arr2[j - 1] = arr[i];
            i++;
        }
        return arr2;
    }

    static int[] splitArrGreaterThan(int[] arr, int n) {
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

    static boolean checkAscending(int[] arr) {
        for (int i = 1, j = 0; i < arr.length; i++, j++)
            if (arr[j] > arr[i])
                return false;
        return true;
    }

    static <T> Object[] change(T[] arr, T a, T b) {
        Object[] a1 = new Object[arr.length];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == a) {
                a1[i] = b;
            } else {
                a1[i] = arr[i];
            }
        return a1;
    }

    static <T> boolean arrayEqualsArray(T[] arr1, T[] arr2) {
        int count = 0;
        for (int i = 0; i < arr2.length; i++)
            for (int j = 0; j < arr1.length; j++)
                if (arr2[i] == arr1[j])
                    count++;
        if (count == arr2.length)
            return true;
        return false;
    }

    static <T> int returnOccurrence(T[] arr1, T[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] == arr2[j])
                    count++;
        return count;
    }

    static <T> Object[] remove(T arr[], T e) {
        Object[] arr2 = new Object[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != e) {
                arr2[j] = arr[i];
                j++;
            }

        }
        return arr2;
    }

    static <T> Object[] addFirst(T arr[], T num) {
        Object[] arr2 = new Object[arr.length + 1];

        for (int i = 0, j = 1; i < arr.length; i++)
            arr2[j++] = arr[i];
        arr2[0] = num;
        return arr2;

    }

    static <T> Object[] addLast(T arr[], T num) {
        Object[] arr2 = new Object[arr.length + 1];

        for (int i = 0; i < arr.length; i++)
            arr2[i] = arr[i];
        arr2[arr.length] = num;
        return arr2;
    }

    static <T> Object[] removeFirst(T arr[], T n) {
        Object[] temp = new Object[arr.length - 1];

        int found = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n) {
                found = i;
                break;
            }

        for (int i = 0, j = 0; i < arr.length; i++)
            if (i != found)
                temp[j++] = arr[i];

        return temp;

    }

    static <T> Object[] removeLast(T arr[], T n) {
        Object[] temp = new Object[arr.length - 1];

        int found = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n)
                found = i;

        for (int i = 0, j = 0; i < arr.length; i++)
            if (i != found)
                temp[j++] = arr[i];

        return temp;

    }

    static <T> Object[] shiftArray(T[] arr, T number) {
        int i = 0;
        Object[] arr2 = new Object[arr.length + 1];

        for (; i < arr.length; i++) {
            arr2[i] = arr[i];

            if (arr[i] == number)
                break;
        }

        arr2[i + 1] = 99;

        for (int k = i + 2; k < arr2.length; k++) {
            arr2[k] = arr[i + 1];
            i++;
        }

        return arr2;
    }

    static <T> Object[] getAllPos(T[] arr, T n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n)
                count++;

        Object[] pos = new Object[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n)
                pos[j++] = i;

        return pos;
    }

    static <T> Object[] join(T[] arr1, T[] arr2) {
        Object[] join = new Object[arr1.length + arr2.length];

        int i = 0;
        for (; i < arr1.length; i++)
            join[i] = arr1[i];

        for (int j = 0; j < arr2.length; j++)
            join[i++] = arr2[j];

        return join;
    }

    static <T> Object[] mergePos(T[] arr1, T[] arr2) {
        int count = 0;

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] == arr2[j])
                    count++;

        Object temp[] = new Object[count];

        for (int i = 0, s = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] == arr2[j])
                    temp[s++] = arr1[i];

        return temp;
    }

    static <T> Object[] occurrenceAdd(T[] arr, T n1, T n2) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n1)
                count++;

        Object[] temp = new Object[arr.length + count];

        try {
            for (int i = 0, j = 0; i < temp.length; i++, j++) {
                if (arr[i] == n1) {
                    temp[j] = arr[i];
                    temp[j++ + 1] = n2;
                } else {
                    temp[j] = arr[i];
                }
            }

        } catch (Exception e) {
            // System.err.print("What is the error: " + e);
        }

        return temp;
    }

    static int leetPiv(int[] arr) {
        if (arr.length == 0)
            return -1;

        int leftSum = 0, rigthSum = 0, sum = 0, posLeft = 0, posRight = 0;

        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        int divSum = sum / 2;

        for (int i = 0; i < arr.length; i++) {
            if (leftSum > divSum - arr[i]) {
                posLeft = i;
                break;
            }
            leftSum = leftSum + arr[i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (rigthSum > divSum - arr[i]) {
                posRight = i;
                break;
            }
            rigthSum = rigthSum + arr[i];

        }

        if (rigthSum == leftSum && posRight == posLeft)
            return posRight;
        else
            return -1;

    }

    /* Assume array is always positive and always sorted in descending order */
    static int[] countCoins(int[] arr, int n) {
        int[] notFoundArr = {0};
        int notFoundN = n;
        int count = 0;
        int newN = n;

        for (int i = 0; i < arr.length; i++) {
            if (n >= arr[i]) {
                n = n - arr[i];
                count++;
                i--;
            }
        }

        int j = 0;
        int[] newArr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (newN >= arr[i]) {
                newN = newN - arr[i];
                newArr[j] = arr[i];
                i--;
                j++;
            }
        }

        int checkSum = 0;
        for (int i : newArr)
            checkSum += i;

        if (newArr.length == 0 || arr.length == 0 || checkSum != notFoundN) {
            return notFoundArr;
        }
        return newArr;
    }

    /* arr must start from 1 to Integer.Max_value */
    static int firstMissingNumber(int[] arr) {
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++)
            count++;

        int[] arr2 = new int[count + 1];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = i + 1;

        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] != arr[i]) {
                n = arr2[i];
                break;
            }
        }

        return n;
    }

    /* arr must be sorted from smallest to largest, else do Arrays.sort(arr)*/
    static void FindAllMissingNumbers(int[] arr) {
        int lastNumber = arr[arr.length - 1];
        int j = 0;
        for (int i = 1; i <= lastNumber; i++) {
            if (i == arr[j]) {
                j++;
            } else {
                System.out.println(i);
            }
        }

    }

    static int findDuplicate(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j] && i != j)
                    n = arr[i];
        return n;
    }

    static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    static int findBiggest(int[] arr) {
        int big = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > big)
                big = arr[i];

        return big;
    }

    static void findPair(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++)
                if (arr[i] + arr[j] == n)
                    System.out.println(arr[i] + " " + arr[j]);
    }

    static int fact(int fact) {
        int sum = 1;
        for (int i = 1; i <= fact; i++)
            sum *= i;
        return sum;
    }

    // recursive
    static int recFact(int fact) {
        if (fact == 1)
            return fact;
        else
            return fact * recFact(fact - 1);
    }

    static int[] removePosRec(int[] arr, int i, int pos, int j, int[] arr2) {

        if (arr.length <= pos)
            return arr;
        if (arr.length == i)
            return arr2;

        if (i != pos)
            arr2[j++] = arr[i];

        return removePosRec(arr, i + 1, pos, j, arr2);
    }

    static int biggestRec(int[] arr, int i, int max) {
        if (arr.length == i)
            return max;

        if (arr[i] > max)
            max = arr[i];

        return biggestRec(arr, i + 1, max);
    }

    static int smallestRec(int[] arr, int i, int max) {
        if (arr.length == i)
            return max;

        if (arr[i] < max)
            max = arr[i];

        return smallestRec(arr, i + 1, max);
    }

    static int[] removeNumberRec(int arr[], int i, int j, int n, int[] arr2) {
        if (arr.length == i)
            return arr2;
        if (arr2.length == j)
            return arr;

        if (arr[i] != n)
            arr2[j++] = arr[i];

        return removeNumberRec(arr, i + 1, j, n, arr2);
    }

    static int[] replacePosRec(int[] arr, int i, int j, int pos, int n, int[] arr2) {
        if (arr.length == i)
            return arr2;

        if (i == pos)
            arr2[j++] = n;
        else
            arr2[j++] = arr[i];

        return replacePosRec(arr, i + 1, j, pos, n, arr2);
    }

    static int linearPosRec(int[] arr, int i, int n) {
        if (arr.length == i)
            return -1;

        if (arr[i] == n)
            return i;

        return linearPosRec(arr, i + 1, n);
    }

    static boolean linearRec(int[] arr, int i, int n) {
        if (arr.length == i)
            return false;

        if (arr[i] == n)
            return true;

        return linearRec(arr, i + 1, n);
    }

    static Map<Integer, Long> ls = new HashMap<>();

    static long recFastFib(int n) {
        if (n <= 2)
            return 1;

        if (ls.get(n) == null) {
            long rec = recFastFib(n - 1) + recFastFib(n - 2);
            ls.put(n, rec);
        }

        return ls.get(n);
    }
}
