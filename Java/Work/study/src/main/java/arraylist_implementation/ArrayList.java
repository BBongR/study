package arraylist_implementation;

public class ArrayList {
    private Object[] elementData;
    private int      size;
    
    public ArrayList() {
        elementData = new Object[10];
        size = 0;
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
    
    public Object get(int index) {
        return elementData[index];
    }
    
    public Object removeFirst() {
        return remove(0);
    }
    
    public Object remove(int index) {
        Object removed = elementData[index];
        for (int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        elementData[size] = null;
        size--;
        return removed;
    }
    
    public Object removeLast() {
        return remove(size - 1);
    }
    
    public int indexof(Object obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }
    
    public int size() {
        return size;
    }
    
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elementData[i];
            if (i < size - 1) {
                str += ", ";
            }
        }
        return str + "]";
    }
    
    public ListIterator listiterator() {
        return new ListIterator();
    }
    
    public class ListIterator {
        private int nextIndex;
        
        public ListIterator() {
            this.nextIndex = 0;
        }
        
        public Object next() {
            return elementData[nextIndex++];
        }
        
        public boolean hasNext() {
            return nextIndex < size;
        }
        
        public Object previous() {
            return elementData[--nextIndex];
        }
        
        public boolean hasPrevious() {
            return nextIndex > 0;
        }
        
        public void add(Object element) {
            ArrayList.this.add(nextIndex, element);
        }
        
        public void remove() {
            ArrayList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }
}
