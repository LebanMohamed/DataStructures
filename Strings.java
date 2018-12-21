import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Strings {
    private static char returnFirtNonDuplicate(String str1) {
        for (int i = 0; i < str1.length(); i++)
            for (int j = i; j < str1.length(); j++)
                if (str1.charAt(i) == str1.charAt(j) && i != j)
                    str1 = str1.replace(str1.substring(i, i + 1), "");
        return str1.charAt(0);
    }

    private static String removeDuplicate(String str1) {
        for (int i = 0; i < str1.length(); i++)
            for (int j = i; j < str1.length(); j++)
                if (str1.charAt(i) == str1.charAt(j) && i != j)
                    str1 = str1.replace(str1.substring(i, i + 1), "");
        return str1;
    }

    private static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        char[] s1 = new char[str1.length()];
        char[] s2 = new char[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            s1[i] = str1.charAt(i);
            s2[i] = str2.charAt(i);
        }

        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s2.length; i++)
            if (s1[i] != s2[i])
                return false;
        return true;

    }

    private static char dupString(String str) {
        char d = ' ';
        for (int j = 0; j < str.length(); j++)
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) == str.charAt(j) && i != j)
                    d = str.charAt(i);
        return d;
    }

    private static boolean palindrome(String s) {
        int count = 0;
        int j = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            if (s.charAt(i) == s.charAt(j))
                count++;

            if (count == s.length())
                return true;
            j--;
        }
        return false;
    }

    private static void occChar(String str) {
        int count = 0;
        char c = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int curCount = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    break;
                }
                curCount++;
                if (curCount > count) {
                    count = curCount;
                    c = str.charAt(i);
                }
            }

        }

        System.out.println(c);
    }

    private static int stringPos(String str, char c) {
        for (int i = 0; i < str.length(); i++)
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(c))
                return i;
        return -1;
    }

    private static int stringPosRec(String str, char c, int i) {
        if (str.length() == i)
            return -1;
        else if (str.toLowerCase().charAt(i) == Character.toLowerCase(c))
            return i;
        return stringPosRec(str, c, i + 1);
    }

    private static int[] stringAllPos(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c)
                count++;

        int[] arr = new int[count];

        int j = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c)
                arr[j++] = i;
        return arr;
    }

    static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    static String recReverse(String str, int i, String reverse) {
        if (i < 0)
            return reverse;

        reverse += str.charAt(i--);

        return recReverse(str, i, reverse);
    }

    static char occCharMap(String str) {
        int counter = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    counter++;
            }
            map.put(str.charAt(i), counter);
            counter = 0;
        }

        Integer max = Collections.max(map.values());
        for (Map.Entry i : map.entrySet())
            if (i.getValue() == max)
                return (char) i.getKey();

        return ' ';
    }

    static char occCharArr(String str) {
        int counter = 0;

        char[] charArr = new char[str.length()];
        int[] intArr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    counter++;
            }
            charArr[i] = str.charAt(i);
            intArr[i] = counter;
            counter = 0;
        }

        int max = 0;
        char found = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
                found = charArr[i];
            }
        }

        return found;
    }

}