import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

import models.Animal;
import services.AnimalService;
import services.impl.AnimalServiceImpl;

public class App {

    private AnimalService animalService = new AnimalServiceImpl();

    public void addAnimals() {
        animalService.add(new Animal(1, "Tiger", LocalDate.now(), "Feline"));
        animalService.add(new Animal(0, "Tiger", LocalDate.now(), "Feline"));
        animalService.add(new Animal(2, "Lion", LocalDate.now().minusDays(5), "Feline"));
        animalService.add(new Animal(3, "Leopard", LocalDate.now().minusMonths(1), "Feline"));
        animalService.add(new Animal(4, "Elephant", LocalDate.now().minusYears(2), "Mammal"));
        animalService.add(new Animal(5, "Wolf", LocalDate.now().minusDays(10), "Canine"));
        animalService.add(new Animal(6, "Fox", LocalDate.now().minusWeeks(3), "Canine"));
        animalService.add(new Animal(7, "Deer", LocalDate.now().minusMonths(6), "Herbivore"));
        animalService.add(new Animal(8, "Zebra", LocalDate.now().minusDays(15), "Herbivore"));
        animalService.add(new Animal(9, "Giraffe", LocalDate.now().minusYears(1), "Herbivore"));
        animalService.add(new Animal(10, "Hyena", LocalDate.now().minusDays(20), "Canine"));
    }

    public void getAnimals(){
        var animals = animalService.findAll();
        animals = animalService.sort();
        System.out.println(animals);
    }

    public void sortAnimals(){
        var animals = animalService.findAll();
        animals.sort(Comparator.comparing(Animal::getDateOfAddition));
        System.out.println(animals);
    }

    public List<Animal> sortAnimalsByDateOfAddition(){
        return animalService.sortByDate();
    }

    public List<Animal> sortBySpecies(){
        return animalService.sortBySpecies();
    }

    public List<Animal> sortById(){
        return animalService.sortBy(Comparator.comparing(Animal::getAnimalId));
    }

    public void distinctAnimals(){
        var animals = animalService.distinct(Animal::getAnimalName);
        System.out.println(animals);
        
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.addAnimals();
        app.distinctAnimals();
    }
}
