package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /**
         * Create an ArrayList of String to store 12 elements.
         * Each element should contains product information separated by comma  :
         * at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         * Task 1 : print only items name
         * Task 2 : print all the prices more than 500
         * Task 3 : print average price
         * Task 4 : print all the items name that has less than 20$ monthly payment.
         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
         * Task 6 : Print all information about most expensive items.
         * Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)
         * Task 8 : Count the items prices more than average price.
         * OPTIONALLY :
         * Task 9 : Remove all the items has more than average price.
         * ------------------------
         * Create 3 more ArrayList objects to separately store  itemNames(String), prices(Double) ,
         * monthlyPayments(Double)  :
          */
        /**
         * Task 1:
         * print only items name
         */
        ArrayList<String> productLst = new ArrayList<>(Arrays.asList("iPone 6S, 499 , 18.71 ",
                "iPhone 6s Plus, 549 ,22.88", "iPhone X,1149,56.16", "MacBookPro, 1499.99, 79.49",
                "ThumbDrive, 39.99, 2.68", "Beats HeadPhones, 349.99, 15.12",
                "Mouse, 79.99, 8.98", "Charger, 39.99, 4.56", "iPad, 429, 18.31", "Dyson Vacuum, 399, 16.25",
                "TV, 2199, 89.49", "Apple Watch, 559, 21.18"));
        System.out.println("all product's list each by each: "+productLst);

    }
}
