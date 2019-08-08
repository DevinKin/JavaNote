package iterator.session3;

public interface Aggregate {
    void add(Object object);
    void remove(Object object);
    Iterator iterator();
}
