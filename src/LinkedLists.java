
public class LinkedLists {

	private static class Cell<T> {
		T first;
		Cell<T> next;

		Cell(T h, Cell<T> t) {
			first = h;
			next = t;
		}
	}

	private static <T> String linkedListToString(Cell<T> list) {
		String str = "[";
		if (list != null) {
			str += list.first;
			for (Cell<T> ptr = list.next; ptr != null; ptr = ptr.next)
				str += "," + ptr.first;
		}
		return str + "]";
	}

	private static <E> boolean findN(E n, Cell<E> lst) {
		for (; lst != null && lst != null; lst = lst.next)
			if (lst.first.equals(n))
				return true;
		return false;
	}

	private static <T> Cell<T> removeFirst(T n, Cell<T> list) {
		Cell<T> ptr, temp = null;
		for (ptr = list; ptr != null && !ptr.first.equals(n); ptr = ptr.next)
			temp = new Cell<T>(ptr.first, temp);
		if (ptr != null)
			ptr = ptr.next;
		for (; temp != null; temp = temp.next)
			ptr = new Cell<T>(temp.first, ptr);
		return ptr;
	}

	private static <T> Cell<T> removeAll(T n, Cell<T> lst) {
		Cell<T> ptr;
		for (ptr = lst; ptr.next != null; ptr = ptr.next) {
			if (ptr.next.first.equals(n))
				ptr.next = ptr.next.next;
			break;
		}
		return lst;
	}

	private static <T> Cell<T> removeLast(T n, Cell<T> lst) {
		Cell<T> ptr, temp = null;
		for (ptr = lst; ptr != null; ptr = ptr.next)

			temp = new Cell<T>(ptr.first, temp);
		for (; temp.next != null; temp = temp.next)
			if (temp.next.first.equals(n)) {
				temp.next = temp.next.next;
				break;
			}

		for (; temp != null; temp = temp.next)
			ptr = new Cell<T>(temp.first, ptr);

		return ptr;
	}

	private static <T> int count(T n, Cell<T> lst) {
		int count = 0;
		Cell<T> ptr;
		for (ptr = lst; ptr != null; ptr = ptr.next)
			if (ptr.first.equals(n))
				count++;
		return count;
	}

	private static <T> int findPos(T n, Cell<T> lst) {
		int pos = 0;
		Cell<T> ptr;
		for (ptr = lst; ptr != null && !ptr.first.equals(n); ptr = ptr.next, pos++)
			;
		if (ptr != null)
			return pos;
		else
			return -1;
	}

	private static <T> Cell<Integer> findPosAll(T n, Cell<T> lst) {
		Cell<T> ptr = lst;
		Cell<Integer> k = null;

		for (int i = 0; ptr != null; ptr = ptr.next, i++)
			if (ptr.first.equals(n))
				k = new Cell<Integer>(i, k);
		Cell<Integer> kk = null;

		for (; k != null; k = k.next)
			kk = new Cell<Integer>(k.first, kk);
		return kk;
	}

	private static <T> Cell<T> joinLists(Cell<T> ls1, Cell<T> ls2) {
		Cell<T> x = ls1;
		Cell<T> ptr;
		for (ptr = ls2; ptr != null; ptr = ptr.next)
			x = new Cell<T>(ptr.first, x);
		Cell<T> y = null;
		for (; x != null; x = x.next)
			y = new Cell<T>(x.first, y);
		return y;
	}

	private static <T> Cell<Integer> addN(Integer n, Cell<Integer> ls) {
		Cell<Integer> ptr, k = null;

		for (ptr = ls; ptr != null; ptr = ptr.next)
			k = new Cell<Integer>(ptr.first + n, k);

		Cell<Integer> kk = null;
		for (; k != null; k = k.next)
			kk = new Cell<Integer>(k.first, kk);
		return kk;
	}

	private static <T extends Comparable<? super T>> boolean remove(Cell<T> ls) {
		Cell<T> ptr;
		for (ptr = ls; ptr.next != null && ptr.first.compareTo(ptr.next.first) <= 0; ptr = ptr.next)
			;
		return ptr.next == null;
	}

	private static <T extends Comparable<? super T>> Cell<T> Join(Cell<T> ls1, Cell<T> ls2) {
		Cell<T> ptr, k = null;
		for (ptr = ls1; ptr.next != null; ptr = ptr.next)
			if (ls1.first.compareTo(ls2.first) > 0)
				k = new Cell<T>(ls1.first, k);
		return k;
	}

}
