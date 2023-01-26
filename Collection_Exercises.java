import java.util.*;

public class Collection_Exercises {
    public static void main (String[] args){

        List<String> color_list = new ArrayList<String>();

        //add colors to the array
        color_list.add("Red");
        color_list.add("Green");
        color_list.add("Blue");

        //Iterate the array using for loop
//        for (String color : color_list){
//           System.out.println(color + " ");
//        }

        //Iterate the array using lambda
//        color_list.forEach(color -> System.out.println(color));

        //add color at position 0
        color_list.add(0, "White");

//      retrieve an element (at a specified index) from a given array list

        //Print the array
        System.out.println(color_list);

        //Print the first item from the list
        System.out.println(color_list.get(0));

    }

}