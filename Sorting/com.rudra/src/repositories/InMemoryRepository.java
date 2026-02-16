package repositories;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public interface InMemoryRepository<T,ID> {
    public T add(T item);
    public T findById(ID id);
    public List<T> findAll();
    public List<T> sort();
    public List<T> sort(Comparator<T> comparator);
    public List<T> distinct(Function<? super T,?> keyExtractor);
}
