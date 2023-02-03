import java.util.*;

public class collectionExercises {
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

        boolean isRedOnTheList = ColorList.contains("Red");
        if(isRedOnTheList) {
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is NOT on the list");
        }

        // copy one array list into another and print it.
        List<String> boxOfColorsList = new ArrayList<>(List.of("Purple", "Beige", "Grey", "Pink", "White", "Salmon", "Brick", "RoseGold", "Cyan"));
        Collections.copy(boxOfColorsList, ColorList);
        System.out.println(boxOfColorsList);
//Create an integer list
        List<Integer> colorBoxNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 7, 8, 9));

// Print the original list
        System.out.println("Original List : \n" + colorBoxNumbers);

//Shuffle the colorBoxNumbers\' list
        Collections.shuffle(colorBoxNumbers, new Random());

//Print the shuffled list
        System.out.println("Shuffled list : \n" + colorBoxNumbers);

//Ensure list capacity
        ((ArrayList<Integer>) colorBoxNumbers).ensureCapacity(12);

//Add 3 numbers, sort and iterate
        colorBoxNumbers.add(17);
        colorBoxNumbers.add(32);
        colorBoxNumbers.add(13);
        Collections.sort(colorBoxNumbers);

        int cbnSize = colorBoxNumbers.size();
        for (int i=0; i < cbnSize; i++){
            System.out.println(colorBoxNumbers.get(i));
        }

//Create a linked List
        LinkedList<String> orderOfColors = new LinkedList<>();

        orderOfColors.add("red");
        orderOfColors.add("green");
        orderOfColors.add("blue");
        orderOfColors.add("orange");
        orderOfColors.add("white");

//Print the orderOfColors linked list
        System.out.println("The Order of colors is:\n" + orderOfColors);

//Iterate with enhanced for loop
        for (String color : orderOfColors){
            System.out.println(color);
        }


        System.out.println("\nIterate the colors but start from blue");
        Integer colorBlueIndex = orderOfColors.indexOf("blue");
        Iterator colorPosition = orderOfColors.listIterator(colorBlueIndex);

        while (colorPosition.hasNext()){
            System.out.println(colorPosition.next());
        }

        System.out.println("\nAdd a grey color at position 0...");
        orderOfColors.addFirst("grey");
        System.out.println("\nThe linked list orderOfColors contains: ");
                orderOfColors.forEach(color -> System.out.println(color));
    }

}