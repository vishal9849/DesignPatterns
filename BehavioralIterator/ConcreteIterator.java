package BehavioralIterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator{

    private List<T> collection;
    private int index;

    public ConcreteIterator(List<T> collection) {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index< collection.size();
    }

    @Override
    public Object next() throws NoSuchFieldException {
        if (hasNext()) {
            return collection.get(index++);
        }else{
            throw new NoSuchFieldException();
        }
    }
}
