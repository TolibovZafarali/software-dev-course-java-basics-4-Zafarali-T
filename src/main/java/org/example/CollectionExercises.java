package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation

        String[] newArray = new String[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = "apple";
        }

        return newArray;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation

        String[] newArray = new String[3];

        newArray[0] = fruits[0];
        newArray[1] = fruits[1];
        newArray[2] = fruits[2];

        return newArray;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation

        ArrayList<String> newArray = new ArrayList<>();

        Collections.addAll(newArray, "apple", "banana", "cherry", "date", "elderberry");
        //Learned this method from stackoverflow.com

        return newArray;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation

        ArrayList<String> newArray = new ArrayList<>();

        Collections.addAll(newArray, fruit1, fruit2, fruit3);

        return newArray;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation

        HashMap<String, String> newHashMap = new HashMap<>();

        newHashMap.put("apple", "red");
        newHashMap.put("banana", "yellow");
        newHashMap.put("cherry", "red");
        newHashMap.put("date", "brown");
        newHashMap.put("elderberry", "black");

        return newHashMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation

        return fruitMap.get("apple");
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation

        HashSet<String> newHashSet = new HashSet<>();

        Collections.addAll(newHashSet, fruit1, fruit2, fruit3);

        return newHashSet;
    }
}
