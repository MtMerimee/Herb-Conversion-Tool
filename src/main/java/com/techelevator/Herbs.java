package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Herbs {

    // INSTANCE VARIABLES
   private Map<String, Double> toTsp = new HashMap<>();
   private Map<String, Double> herbList = new HashMap<>();
   private boolean fresh = false;

    // CONSTRUCTORS


    // GETTERS AND SETTERS
    public Map<String, Double> getHerbList(){
        return herbList;
    }
    public void setHerbList (){
        this.herbList = herbList;
    }

    // MEASUREMENT METHODS

    // MAP INPUTS
    public void inputHerbs (){
        herbList.put("Chervil", 3.0);
        herbList.put("Cilantro", 3.0);
        herbList.put("Dill", 3.0);
        herbList.put("Marjoram", 3.0);
        herbList.put("Oregano", 3.0);
        herbList.put("Rosemary", 3.0);
        herbList.put("Tarragon", 3.0);
        herbList.put("Thyme", 3.0);
        herbList.put("Parsley", 2.0);
        herbList.put("Sage", 2.0);
        herbList.put("Garlic", 3.0);
        herbList.put("Bay Leaf", -2.0);
        herbList.put("Onion", 72.0);
        herbList.put("Ginger", 8.0);
        herbList.put("Cinnamon", 0.5);
        herbList.put("Star Anise", 0.5);
    }

    public void convertToTsp(){
        toTsp.put("Cup", 48.0);
        toTsp.put("Tbsp", 3.0);
    }
}