package services.impl;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import models.Animal;
import repositories.AnimalRepository;
import services.AnimalService;

public class AnimalServiceImpl implements AnimalService {

    private AnimalRepository animalRepository = new AnimalRepository();

    private final Comparator<Animal> byDate = Comparator.comparing(animal->animal.getAnimalName());
    private final Comparator<Animal> bySpecies = Comparator.comparing(animal->animal.getSpecies());

    @Override
    public Animal add(Animal a) {
       return animalRepository.add(a);
    }

    @Override
    public Animal findById(Integer id) {
        return animalRepository.findById(id);
    }

    @Override
    public List<Animal> sort() {
       return animalRepository.sort();
    }

    public List<Animal> sortBy(Comparator<Animal> comparator){
        return animalRepository.sort(comparator);
    }

    public List<Animal> sortByDate(){
        return animalRepository.sort(byDate);
    }

    public List<Animal> sortBySpecies(){
        return animalRepository.sort(bySpecies);
    }

    @Override
    public List<Animal> findAll() {
       return animalRepository.findAll();
    }

    @Override
    public List<Animal> distinct(Function<Animal,?> keyExtractor) {
        return animalRepository.distinct(keyExtractor);
    }
}
