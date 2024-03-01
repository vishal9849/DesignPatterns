package BehavioralIterator;

public interface Iterator<T> {
    boolean hasNext();

    T next() throws NoSuchFieldException;
}
