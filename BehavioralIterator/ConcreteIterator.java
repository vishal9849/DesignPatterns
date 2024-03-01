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
    public Object next() {
        if (hasNext()) {
            return collection.get(index++);
        }else{
            try {
                throw new NoSuchFieldException();
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
