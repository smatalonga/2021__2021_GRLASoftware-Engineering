package com.uws.week10.templateMethod;

import java.util.Comparator;

import java.util.*;

public class SortAnimalsCriteriaByVertebrates extends AnimalSortingCriteria {
	
    @Override
    public int compare(Animal t, Animal t1) {
        Animal firstAnimal = (Animal) t;
        Animal secondAnimal = (Animal) t1;

        if (firstAnimal.isVertebrate()
                == secondAnimal.isVertebrate()) {
            return 0;
        } else if (firstAnimal.isVertebrate()
                || secondAnimal.isVertebrate()) {
            return 1;
        } else {
            return -1;
        }
    }
}
