package repositories;

import java.util.Comparator;

import models.Animal;
import repositories.base.AbstractInMemoryRepository;

public class AnimalRepository extends AbstractInMemoryRepository<Animal,Integer> {

    @Override
    protected Integer getId(Animal item) {
       return item.getAnimalId();
    }

    @Override
    protected Comparator<Animal> getComparator() {
      return Comparator.comparing(Animal::getAnimalName);
    }
}
