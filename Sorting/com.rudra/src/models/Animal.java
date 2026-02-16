package models;

import java.time.LocalDate;

public class Animal {
    private Integer animalId;
    private String animalName;
    private LocalDate dateOfAddition;
    private String species;

    public Animal(){

    }

    public Animal(Integer animaId, String animalName, LocalDate dateOfDateAddition, String species){
        this.animalId=animaId;
        this.animalName=animalName;
        this.dateOfAddition=dateOfDateAddition;
        this.species=species;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public LocalDate getDateOfAddition() {
        return dateOfAddition;
    }

    public void setDateOfAddition(LocalDate dateOfAddition) {
        this.dateOfAddition = dateOfAddition;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal [animalId=" + animalId + ", animalName=" + animalName + ", dateOfAddition=" + dateOfAddition
                + ", species=" + species + "]";
    }

    
    
    
}
