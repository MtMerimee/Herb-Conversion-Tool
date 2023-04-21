
package com.techelevator;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // LISTS OF HERBS WHICH NEED DIFFERENT CONVERSION RATIOS
        List<String> herbList2 = new ArrayList<>();
        herbList2.add("parsley");
        herbList2.add("basil");
        herbList2.add("sage");

        List<String> herbList3 = new ArrayList<>();
        herbList3.add("rosemary");
        herbList3.add("oregano");
        herbList3.add("chervil");
        herbList3.add("cilantro");
        herbList3.add("dill");
        herbList3.add("marjoram");
        herbList3.add("tarragon");
        herbList3.add("thyme");

        System.out.println();
        // WELCOME.
        System.out.println("Welcome to the Herb Conversion Tool where you can convert fresh and dry herbs. ");
        System.out.println();
        System.out.println("Here are the Herbs able to be converted:" +
                "\n Parsley | " + "Basil | " + "Rosemary" +
                "\n Oregano | " + "Sage | " + "Thyme" +
                "\n Chervil | " + "Cilantro | " + "Dill" +
                "\n Marjoram | " + "Tarragon");


        System.out.println();
        // HOW MUCH?
        try {
            System.out.print("Enter Recipe Amount: ");
            double inputAmount = scanner.nextDouble(); //getting the amount and converting it into an double to run the conversion methods on.


            // WHICH HERB?
            String herb; // Proper to Herbs
            System.out.print("Which herb would you like to convert? ");
            herb = scanner.nextLine(); // Gets the type of herb.

            // UNIT OF MEASUREMENT?
            String unit; // proper to Measurements
            System.out.print("What Measurement is Being Called for? Tsp | Tbsp | Cup? ");
            unit = scanner.nextLine();
            while(!(unit.equalsIgnoreCase("tsp") || unit.equalsIgnoreCase("tbsp") || unit.equalsIgnoreCase("cup"))){
                System.out.print("Enter a Valid Unit of Measurement... Tsp | Tbsp | Cup ");
                unit = scanner.nextLine();
            }

            // FRESH OR DRY?
            String type;
            System.out.print("Is your recipe calling for Fresh or Dry ingredient? ");
            type = scanner.nextLine();
            while(!type.equalsIgnoreCase("fresh") || type.equalsIgnoreCase("dry")){
                System.out.print("Enter a Valid Value... Fresh | Dry ");
                type = scanner.nextLine();
            }
            boolean fresh = false; // Proper to Herbs
            if (type.equalsIgnoreCase("fresh")) {
                fresh = true;
            } else if (type.equalsIgnoreCase("dry")) {
                fresh = false;
            }


            // ***METHODS***

            // TO TSP
            //variable that houses the amount in tsp to use in conversion methods.
            double amount = 0; // Proper to measurements
            if (unit.equalsIgnoreCase("tbsp")) {
                amount = inputAmount * 3;
            } else if (unit.equalsIgnoreCase("cup")) {
                amount = inputAmount * 48;
            } else if (unit.equalsIgnoreCase("tsp")) {
                amount = inputAmount;
            }

            // CONVERSION METHOD
            // loop through herb map and check if name is equal to key.
            for (int i = 0; i < herbList2.size(); i++) {
                if (herb.equalsIgnoreCase(herbList2.get(i)) && fresh) {
                    amount /= 2;
                }
                if (herb.equalsIgnoreCase(herbList2.get(i)) && !fresh) {
                    amount *= 2;
                }
            }
            for (int i = 0; i < herbList3.size(); i++) {
                if (herb.equalsIgnoreCase(herbList3.get(i)) && fresh) {
                    amount /= 3;
                }
                if (herb.equalsIgnoreCase(herbList3.get(i)) && !fresh) {
                    amount *= 3;
                }
            }

            // OUTPUT MEASUREMENT UNIT
            if (amount >= 12) {
                unit = "Cup";
                amount /= 48;
            } else if (amount >= 3) {
                unit = "Tbsp";
                amount /= 3;
            } else {
                unit = "tsp";
            }

            String freshOrDry;
            if (fresh) {
                freshOrDry = "Dry";
            } else {
                freshOrDry = "Fresh";
            }

            // FINAL OUTPUT MESSAGE
            System.out.println();
            DecimalFormat df = new DecimalFormat("##.##"); // creating a decimal format to deal with rounding errors.
            System.out.println("You need " + df.format(amount) + " " + unit.toUpperCase() + "'S " + "of " + freshOrDry.toUpperCase() + " " + herb);

        }
        catch(NullPointerException e){
            System.out.println("No number provided. Please enter a number.");
        }
        catch (NumberFormatException e){
            System.out.println("Not a number. Please restart and enter a number.");
        }
    }
}
