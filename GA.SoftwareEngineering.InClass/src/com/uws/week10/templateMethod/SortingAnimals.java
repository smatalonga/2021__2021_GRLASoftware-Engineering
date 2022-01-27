package com.uws.week10.templateMethod;


import java.util.*;

/**
 * Holds concrete strategies for working with animal lists.
 * @keaplogik
 */
public class SortingAnimals {
    
       
    private SortingAnimals(){}

    public ArrayList<Animal> sortAnimals(ArrayList<Animal> list, AnimalSortingCriteria criteria){
    	
    	list.sort(criteria);//Sort from ArrayList uses "CompareTo" from Comparator, 
    	return list;
    }
    
}