import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Collection_Exercises {
    public static void main (String[] args){

        List<String> ColorList = new ArrayList<String>();

        //add colors to the array
        ColorList.add("Red");
        ColorList.add("Green");
        ColorList.add("Blue");

        //Iterate the array using Enhanced for loop
//        for (String color : ColorList){
//           System.out.println(color + " ");
//        }

        //Iterate the array using lambda
//        ColorList.forEach(color -> System.out.println(color));

        //add color at position 0
        ColorList.add(0, "White");

//      retrieve an element (at a specified index) from a given array list

        //Print the array
        System.out.println(ColorList);

        //Print the first item from the list
        System.out.println(ColorList.get(0));

        //update first element to become black
        ColorList.set(0, "Black");

        //sort by name and print
        Collections.sort(ColorList);
        System.out.println(ColorList);

        //remove the third element from the array list
        ColorList.remove(2);
        System.out.println(ColorList);

        //search an element in an array list.

        Boolean isRedOnTheList = ColorList.contains("Red");
        if(isRedOnTheList) {
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is NOT on the list");
        }

        // copy one array list into another and print it.
        List<String> BoxOfColorsList = new ArrayList<String>();

        BoxOfColorsList.add("Purple");
        BoxOfColorsList.add("Beige");
        BoxOfColorsList.add("Grey");
        BoxOfColorsList.add("Pink");
        BoxOfColorsList.add("Yellow");

        Collections.copy(BoxOfColorsList, ColorList);
        System.out.println(BoxOfColorsList);
    }

}