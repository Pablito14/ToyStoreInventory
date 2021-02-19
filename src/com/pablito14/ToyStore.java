package com.pablito14;

import java.util.Map;
import java.util.TreeMap;

public class ToyStore {

    // Instance Variable
    private Map<Toy,Integer> store;

    // Constructor
    public ToyStore(){
        this.store = new TreeMap<Toy, Integer>();
    }

    // Instance Methods
    public void loadToys(String toys){

    }

    public Toy findToy(String toyName){

        // if the store has this toy already in it
        if(this.store.containsKey(toyName)){

            // return that toy that's in the treeMap
            //TODO: find out how to return the key in a tree map and not the value
            return new Toy("Buzz Lightyear", 4);
        } else {
            return null;
        }

    }

    public String getMostFrequentToy(){

    }

    public String toString(){

    }
}
