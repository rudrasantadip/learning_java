package repositories.base;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import repositories.InMemoryRepository;

public abstract class AbstractInMemoryRepository<T,ID> implements InMemoryRepository<T,ID> {

    protected Map<ID,T> storage = new HashMap<>();

    @Override
    public T add(T item) {
        storage.put(getId(item),Objects.requireNonNull(item));
        return storage.get(getId(item));
    }

    @Override
    public T findById(ID id) {
       return storage.get(id);
    }

    @Override
    public List<T> sort() {
        List<T> sorted = new ArrayList<>(storage.values());
        sorted.sort(getComparator());
        return sorted;
    }


    @Override
    public List<T> sort(Comparator<T> comparator){
        return new ArrayList<>(storage.values()).stream()
        .sorted(comparator)
        .toList();
    }

    @Override
    public List<T> findAll(){
        return new ArrayList<>(storage.values());
    }

    @Override
    public List<T> distinct(Function<? super T,?> keyExtractor){
        return new ArrayList<>(storage.values())
        .stream()
        .filter(distinctByKey(keyExtractor))
        .toList();
    }


    private Predicate<T> distinctByKey(Function<? super T,?> keyExtractor){
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t->seen.add(keyExtractor.apply(t));
    }

    protected abstract ID getId(T item);
    protected abstract Comparator<T> getComparator();

}
