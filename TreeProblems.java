/*
 * *** BRODY DARRAH / COMP 272, SECTION 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.


    // Create 2 new sets, one for unique elements, one for common elements.
    Set<Integer> unique = new TreeSet<>(setA);
    unique.addAll(setB);
    Set<Integer> common = new TreeSet<>(setA);
    common.retainAll(setB);

    // remove common elements
    unique.removeAll(common);
    return unique;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.

    // Collect keys to remove into a list
    List<Integer> toRemove = new ArrayList<>();
    for (Integer k : treeMap.keySet()){
      if (k % 2 == 0){
        toRemove.add(k);
      }
    }
    // Remove all collected keys from the map
    for (Integer k : toRemove){
      treeMap.remove(k);
    }
    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    if (tree1.size() != tree2.size()){
      return false; // different sizes
    }
    for (Map.Entry<Integer, String> entry : tree1.entrySet()){
      // check if key exists and val matches
      if (!tree2.containsKey(entry.getKey())){
        return false;
      }
      if (!tree2.get(entry.getKey()).equals(entry.getValue())){
        return false;
      }
    }
    return true;
  }

} // end treeProblems class
