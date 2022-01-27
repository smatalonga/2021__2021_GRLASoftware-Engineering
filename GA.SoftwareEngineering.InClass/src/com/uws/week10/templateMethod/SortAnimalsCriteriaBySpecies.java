package com.uws.week10.templateMethod;

import java.util.Comparator;

public class SortAnimalsCriteriaBySpecies extends AnimalSortingCriteria {

    @Override
    public int compare(Animal t, Animal t1) {
        Animal firstAnimal = (Animal) t;
        Animal secondAnimal = (Animal) t1;

       return firstAnimal.getSpecies().compareTo(secondAnimal.getSpecies());
    }

	
};