package iterator;

import java.util.Vector;

public class IteratorImplementation<String> implements ExtendedIterator<String>{
	private Vector<String> data;
    private int index;

    public IteratorImplementation(Vector<String> data) {
        this.data = data;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < data.size();
    }

    @Override
    public String next() {
        return data.get(index++);
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public String previous() {
        return data.get(--index);
    }

    @Override
    public void goFirst() {
        index = 0;
    }

    @Override
    public void goLast() {
        index = data.size();
    }
}
