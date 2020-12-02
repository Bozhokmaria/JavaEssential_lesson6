package task1;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo =new ArrayList();
        zoo.add("lion");
        zoo.add("monkey");
        zoo.add("snakes");
        zoo.add("bear");
        zoo.add("peacock");
        zoo.add("penguin");
        zoo.add("horse");
        zoo.add("swan");


        for (String animal: zoo) {
            System.out.println(animal);
        }


        System.out.println(zoo);
    }
}
