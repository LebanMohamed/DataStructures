import java.util.ArrayList;

public class ArrayLists {

	private static ArrayList<String> removeLessThanDestructively(ArrayList<String> ls, int n) {
		for (int i = 0; i < ls.size(); i++)
			if (ls.get(i).length() < n)
				ls.remove(i--);
		return ls;
	}

	private static ArrayList<String> removeLessThanConstructively(ArrayList<String> ls, int n) {
		ArrayList<String> ls2 = new ArrayList<String>();
		for (int i = 0; i < ls.size(); i++)
			if (ls.get(i).length() >= n)
				ls2.add(ls.get(i));
		return ls2;
	}

	private static <T> void replaceFirstDestructively(ArrayList<T> ls, T n1, T n2) {
		for (int i = 0; i < ls.size(); i++)
			if (ls.get(i).equals(n1)) {
				ls.set(i, n2);
				break;
			}
	}

	private static <T> ArrayList<T> replaceFirstConstructively(ArrayList<T> ls, T n1, T n2) {
		ArrayList<T> ls2 = new ArrayList<T>();
		for (int i = 0; i < ls.size(); i++)
			if (ls.get(i).equals(n1))
				ls2.add(n2);
			else
				ls2.add(ls.get(i));
		return ls2;
	}

	private static <T>ArrayList<ArrayList<T>> remove(ArrayList<ArrayList<T>> ls, int n) {
		ArrayList<ArrayList<T>> ls2 = new ArrayList<>();
		for (int i = 0; i < ls.size(); i++) 
 			if (!ls.get(i).contains(n))
				ls2.add(ls.get(i));
		return ls2;
	} 
	
    private static int rec(ArrayList<Integer> ls, int counter, int size, int i) {
        if (size == 0)
            return counter;
        else if (ls.get(i) == 4)
            return rec(ls, counter + 1, size - 1, i + 1);
        else
            return rec(ls, counter, size - 1, i + 1);
    }
}
