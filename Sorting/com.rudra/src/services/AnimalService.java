package services;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import models.Animal;

public interface AnimalService {
    public Animal add(Animal a);
    public Animal findById(Integer id);
    public List<Animal> sort();
    public List<Animal> sortBy(Comparator<Animal> comparator);
    public List<Animal> sortByDate();
    public List<Animal> sortBySpecies();
    public List<Animal> findAll();
    public List<Animal> distinct(Function<Animal,?> keyGenerator);
}
