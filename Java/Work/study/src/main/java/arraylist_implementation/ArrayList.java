package arraylist_implementation;

public class ArrayList {
	private Object[] elementData = new Object[100];
	private int size = 0;

	public Object remove(int index) {
		Object temp = elementData[index];
		for (int i = index + 1; i < size; i++) {
			elementData[i - 1] = elementData[i];
		}
		elementData[size] = null;
		size--;
		return temp;
	}

	public boolean addFirst(Object element) {
		return add(0, element);
	}

	public boolean add(int index, Object element) {
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}

	public boolean addLast(Object element) {
		elementData[size++] = element;
		return true;
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1)
				str += ",";
		}
		return str + "]";
	}
}
